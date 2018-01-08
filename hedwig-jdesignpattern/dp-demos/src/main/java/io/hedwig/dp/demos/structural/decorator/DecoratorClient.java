package io.hedwig.dp.demos.structural.decorator;

/**
 * 1. author: patrick
 */
public class DecoratorClient {

  public static void main(String[] args) {
    Component c = new ComponentA();
    Decorator d = new DecoratorA();
    d.setComponent(c);
    d.operation();
  }

}
