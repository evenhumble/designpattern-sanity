package io.hedwig.dp.demos.structural.decorator;

/**
 * 1. author: patrick
 */
public abstract class Decorator {
  private Component component;
  public abstract void operation();

  public Component getComponent() {
    return component;
  }

  public void setComponent(Component component) {
    this.component = component;
  }
}
