package io.hedwig.dp.demos.creation.abstractfactory.products;

import io.hedwig.dp.demos.creation.abstractfactory.ProductA;

/**
 * 1. author: patrick 2. address: github.com/ideafortester
 */
public class ProductAB implements ProductA {

  @Override
  public String getDescription() {
    return "This is AB product";
  }

  @Override
  public void demoIt() {
    System.out.println("AB");
  }
}
