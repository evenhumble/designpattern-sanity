package io.hedwig.dp.demos.structural.bridge;

/**
 * 1. author: patrick
 */
public interface Implementor {

  public default void operationImpl(){
    System.out.println("this is default implementor!");
  }

}
