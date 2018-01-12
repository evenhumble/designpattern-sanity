package io.hedwig.dp.advanced.caching;

/**
 * @@author: patrick
 */
public enum CachingPolicy {
  THROUGH("through"), AROUND("around"), BEHIND("behind"), ASIDE("aside");

  private String policy;

  private CachingPolicy(String policy) {
    this.policy = policy;
  }

  public String getPolicy() {
    return policy;
  }
}
