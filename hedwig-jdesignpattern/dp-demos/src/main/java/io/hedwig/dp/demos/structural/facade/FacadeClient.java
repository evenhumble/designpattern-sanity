package io.hedwig.dp.demos.structural.facade;

/**
 * 1. author: patrick
 */
public class FacadeClient {

  public static void main(String[] args) {
    Facade f = new Facade();
    f.subAandSubAB();
    f.subAandSubB();
  }
}
