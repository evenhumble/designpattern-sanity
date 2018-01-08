package io.hedwig.dp.demos.creation.factoryMethod;

/**
 * 1. author: patrick
 */
public class DatabaseLogger implements Logger {

  @Override
  public void writeLog() {
    System.out.println("this is DatabaseLogger");
  }
}
