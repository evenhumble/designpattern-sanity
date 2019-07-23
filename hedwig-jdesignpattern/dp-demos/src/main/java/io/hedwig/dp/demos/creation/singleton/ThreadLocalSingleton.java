package io.hedwig.dp.demos.creation.singleton;

/**
 * @author: patrick on 2019-07-23
 * @Description:
 */
public class ThreadLocalSingleton {
  private static final ThreadLocal<ThreadLocalSingleton> localThreads
      = new ThreadLocal<>();

  static {
    localThreads.set(new ThreadLocalSingleton());
  }

  public static ThreadLocalSingleton getInstance(){
    if (localThreads.get()==null){
      ThreadLocalSingleton tls = new ThreadLocalSingleton();
      localThreads.set(tls);
      return tls;
    }

    return localThreads.get();
  }

  public String invoke(){
    System.out.println("this is invoke method");
    return Thread.currentThread().getName();
  }

}
