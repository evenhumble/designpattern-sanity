package io.hedwig.dp.demos.structural.decorator;

/**
 * 1. author: patrick
 */
public interface Component {
  public default void operation(){
    System.out.println("default component method!");
  }
}
