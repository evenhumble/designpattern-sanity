package io.hedwig.dp.demos.creation.factoryMethod;

/**
 * 1. author: patrick
 */
public class FileLogger implements Logger {

  @Override
  public void writeLog() {
    System.out.println("this is FileLogger");
  }
}
