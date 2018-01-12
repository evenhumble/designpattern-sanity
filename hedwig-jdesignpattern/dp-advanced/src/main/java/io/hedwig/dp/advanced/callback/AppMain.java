package io.hedwig.dp.advanced.callback;

/**
 * @@author: patrick
 */
public class AppMain {

  public static void main(String[] args) {
    Task task = new SimpleTask();
    CallBack cb = () -> {
      System.out.println("this is from callback");
      return new Object();
    };
    task.executeWith(cb);
  }
}
