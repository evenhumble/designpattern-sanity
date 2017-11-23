package io.hedwig.dp.demos.structural.decorator;

/**
 * 1. author: patrick
 */
public class DecoratorA extends Decorator{

  @Override
  public void operation() {
    before();
    super.getComponent().operation();
    System.out.println("this is DecoratorA");
  }

  private void before(){
    System.out.println("this is before!");
  }
}
