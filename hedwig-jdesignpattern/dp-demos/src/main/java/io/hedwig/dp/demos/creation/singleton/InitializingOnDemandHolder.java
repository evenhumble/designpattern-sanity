package io.hedwig.dp.demos.creation.singleton;

public final class InitializingOnDemandHolder {

  /**
   * Private constructor.
   */
  private InitializingOnDemandHolder() {}

  /**
   * @return Singleton instance
   */
  public static InitializingOnDemandHolder getInstance() {
    return HelperHolder.INSTANCE;
  }

  /**
   * Provides the lazy-loaded Singleton instance.
   */
  private static class HelperHolder {
    private static final InitializingOnDemandHolder INSTANCE =
        new InitializingOnDemandHolder();
  }
}
