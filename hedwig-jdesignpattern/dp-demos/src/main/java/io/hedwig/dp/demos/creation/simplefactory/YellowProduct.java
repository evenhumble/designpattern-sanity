package io.hedwig.dp.demos.creation.simplefactory;

import io.hedwig.dp.demos.creation.Product;

/**
 * 1. author: patrick
 */
public class YellowProduct implements Product {

  @Override
  public void make() {
    System.out.println("this is Yellow");
  }
}
