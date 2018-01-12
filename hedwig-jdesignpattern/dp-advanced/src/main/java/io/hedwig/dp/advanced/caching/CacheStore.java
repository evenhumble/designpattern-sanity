package io.hedwig.dp.advanced.caching;

import java.util.List;

import lombok.extern.slf4j.Slf4j;

/**
 * @@author: patrick
 */
@Slf4j
public class CacheStore {

  static LruCache cache;
  private static DbManager dbManager = new DbManager();

  private CacheStore() {
  }

  /**
   * Get user account using read-through cache
   * read-through, it is not not in cache, put it into cache
   */
  public static User readThrough(String userId) {
    if (cache.contains(userId)) {
      log.info("# Cache Hit!");
      return cache.get(userId);
    }
    log.info("# Cache Miss!");
    User user = dbManager.getUser(userId);
    cache.set(userId, user);
    return user;
  }

  /**
   * write through cache,write to both cache and db
   */
  public static void writeThrough(User user) {
    if (cache.contains(user.getUserId())) {
      dbManager.updateUser(user);
    } else {
      dbManager.updateUser(user);
    }
    cache.set(user.getUserId(), user);
  }

  public static void writeAround(User user) {
    if (cache.contains(user.getUserId())) {
      dbManager.updateUser(user);
      cache.invalidate(user.getUserId());
    } else {
      dbManager.updateUser(user);
    }
  }

  /**
   * read through with write back policy
   * 1. read cache through
   * 2. write back to cache with db value
   */
  public static User readThroughWithWriteBackPolicy(String userId) {
    if (cache.contains(userId)) {
      log.info("Cache Hit!");
      return cache.get(userId);
    }
    log.info("Cache Missing");
    User user = dbManager.getUser(userId);
    if (cache.isFull()) {
      log.info("Cache is Full!Writing LRU Data to DB ....");
      User writeTODB = cache.getLruData();
      dbManager.updateUser(writeTODB);
    }
    cache.set(userId, user);
    return user;
  }

  /**
   * write to both cache and db
   */
  public static void writeBehind(User user) {
    if (cache.isFull() && !cache.contains(user.getUserId())) {
      log.info("# Cache is Full! writeing lRU data to db");
      User toBeWrittenToDB = cache.getLruData();
      dbManager.updateUser(toBeWrittenToDB);
    }
    cache.set(user.getUserId(), user);
  }

  /**
   * clear the cache
   */
  public static void cleanCache() {
    if (cache != null) {
      cache.clear();
    }
  }

  public static void flushCache() {
    log.info("flush cache now ....");
    if (cache != null) {
      List<User> users = cache.getCacheDataInListForm();
      for (User user : users) {
        dbManager.updateUser(user);
      }
    }
  }

  public static User get(String userId) {
    return cache.get(userId);
  }

  public static void write(User user) {
    cache.set(user.getUserId(), user);
  }

  public static void invalidate(String userId) {
    cache.invalidate(userId);
  }
}
