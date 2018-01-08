package io.hedwig.dp.demos.creation.singleton;

/**
 * 1. author: patrick
 */
public enum EnumSingleton {
  INSTANCE;

  @Override
  public String toString() {
    return getDeclaringClass().getCanonicalName() + "@" + hashCode();
  }
}
