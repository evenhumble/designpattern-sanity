package io.hedwig.dp.demos.creation.singleton;

/**
 * 1. author: patrick
 */
public class SingletonClient {

  private volatile  static SingletonClient ourInstance = new SingletonClient();
  private static Object object = new Object();

  public static SingletonClient getInstance() {
    return ourInstance;
  }

  private SingletonClient() {
  }

  /**
   * lazy initialization,actually need double check
   * @return
   */
  public static SingletonClient getInstanceLock() {
    synchronized (object) {
      if (ourInstance == null) {
        synchronized (SingletonClient.class){
          if(ourInstance==null){
            ourInstance = new SingletonClient();
          }
        }

      }
    }
    return ourInstance;
  }
}
