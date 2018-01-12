package io.hedwig.dp.advanced.caching;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import lombok.extern.slf4j.Slf4j;

/**
 * @@author: patrick
 */
@Slf4j
public class AppManager {

  private static CachingPolicy policy;
  private static Map<String, Function<User, User>> policyHandlers = new HashMap<>();
  private static DbManager dbManager = new DbManager();

  public void init() {

  }

  public void initPolicyHandlers() {

    policyHandlers.put(CachingPolicy.AROUND.name(),
                       user -> {
                         CacheStore.writeAround(user);
                         return user;
                       });
    policyHandlers.put(CachingPolicy.BEHIND.name(),
                       user -> {
                         CacheStore.writeBehind(user);
                         return user;
                       });
    policyHandlers.put(CachingPolicy.THROUGH.name(),
                       user -> {
                         CacheStore.writeThrough(user);
                         return user;
                       });
    policyHandlers.put(CachingPolicy.ASIDE.name(),
                       user -> {
                         saveAside(user);
                         return user;
                       });
  }

  private static void saveAside(User user) {
    dbManager.updateUser(user);
    CacheStore.invalidate(user.getUserId());
  }

  public void destroy() {
    CacheStore.cleanCache();
  }

  public User find(String id) {

    if (policy == CachingPolicy.THROUGH ||
        policy == CachingPolicy.AROUND) {
      return CacheStore.readThrough(id);
    } else if (policy == CachingPolicy.BEHIND) {
      return CacheStore.readThroughWithWriteBackPolicy(id);
    } else if (policy == CachingPolicy.ASIDE) {
      return findASide(id);
    }
    throw new RuntimeException("Not Found!");
  }

  public User find(User user) {
    return user;
  }

  public User save(User user) {

    return policyHandlers.get(policy.name()).apply(user);
  }

  public User findASide(String id) {
    User user = CacheStore.get(id);
    if (user != null) {
      return user;
    }
    user = dbManager.getUser(id);
    if (user != null) {
      CacheStore.write(user);
    }
    return user;
  }
}
