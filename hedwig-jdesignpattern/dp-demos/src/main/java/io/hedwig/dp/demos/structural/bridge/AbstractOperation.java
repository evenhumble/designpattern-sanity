package io.hedwig.dp.demos.structural.bridge;


/**
 * 1. author: patrick
 */
public abstract class AbstractOperation {
  private Implementor implementor;
  public abstract void operation();

  public Implementor getImplementor() {
    return implementor;
  }

  public void setImplementor(Implementor implementor) {
    this.implementor = implementor;
  }
}
