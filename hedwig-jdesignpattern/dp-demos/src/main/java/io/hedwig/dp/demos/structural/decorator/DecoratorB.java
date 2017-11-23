package io.hedwig.dp.demos.structural.decorator;

/**
 * 1. author: patrick
 */
public class DecoratorB extends Decorator{

  @Override
  public void operation() {

    super.getComponent().operation();
    System.out.println("this is DecoratorB");
    after();
  }

  private void after(){
    System.out.println("this is after!");
  }
}
