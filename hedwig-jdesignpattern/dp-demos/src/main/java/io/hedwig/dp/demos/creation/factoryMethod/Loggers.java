package io.hedwig.dp.demos.creation.factoryMethod;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 1. author: patrick
 */
public class Loggers {

  private static Map<String, Class> factories = new ConcurrentHashMap<>();

  static {
    factories.put(LoggerType.DB.name(), DatabaseLoggerFactory.class);
    factories.put(LoggerType.FILE.name(), FileLoggerFactory.class);
  }

  public static Logger createLogger(String loggerName) {
    LoggerFactory factory;
    try {
      factory = (LoggerFactory) factories.getOrDefault(loggerName, FileLoggerFactory.class)
          .newInstance();
    } catch (InstantiationException | IllegalAccessException e) {
      e.printStackTrace();
      factory = new FileLoggerFactory();
    }

    return factory.createLogger();

  }

  public static enum LoggerType {
    DB, FILE;
  }
}
