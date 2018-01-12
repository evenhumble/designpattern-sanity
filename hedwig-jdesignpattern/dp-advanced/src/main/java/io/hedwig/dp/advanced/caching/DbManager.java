package io.hedwig.dp.advanced.caching;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.UpdateOptions;

import org.bson.Document;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @@author: patrick
 */
public class DbManager {

  private MongoClient mongoClient;
  private MongoDatabase mongoDatabase;
  private static Map<String, User> userInMem;

  public DbManager() {
    init();
  }

  private void init() {
    userInMem = new ConcurrentHashMap<>();
    connectMongo();
  }

  private void connectMongo() {
    mongoClient = new MongoClient();//default localhost
    mongoDatabase = mongoClient.getDatabase("test");
  }

  /**
   * getting user from cache, if not in cache then fail over to MongoDB
   */
  public User getUser(String userId) {
    if (userInMem.containsKey(userId)) {
      return userInMem.get(userId);
    } else {
      FindIterable<Document>
          rs =
          mongoDatabase.getCollection("user").find(new Document("userId", userId));

      if (rs == null) {
        throw new RuntimeException("Not Found");
      } else {
        Document doc = rs.first();
        User user = new User(doc.getString("userId"), doc.getString("name"));
        userInMem.put(user.getUserId(), user);
        return user;
      }
    }
  }

  public void updateUser(User user) {
    String key = user.getUserId();
    if (userInMem.containsKey(key)) {
      userInMem.put(key, user);
      mongoDatabase.getCollection("user")
          .updateOne(new Document("userId", user.getUserId()),
                     new Document("$set", new Document("name", user.getName())));
    }else{
      mongoDatabase.getCollection("user")
          .insertOne(new Document("userId", user.getUserId())
          .append("name",user.getName()));
      userInMem.put(user.getUserId(),user);
    }
  }

  /**
   * upsert
   * @param user
   */
  public void upsertUser(User user) {
    String key = user.getUserId();
    if (userInMem.containsKey(key)) {
      userInMem.put(key, user);
      mongoDatabase.getCollection("user")
          .updateOne(new Document("userId", user.getUserId()),
                     new Document("$set", new Document("name", user.getName())),
                     new UpdateOptions().upsert(true));
    }else{
      mongoDatabase.getCollection("user")
          .insertOne(new Document("userId", user.getUserId())
                         .append("name",user.getName()));
      userInMem.put(user.getUserId(),user);
    }
  }
}
