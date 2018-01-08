package io.hedwig.dp.demos.creation.abstractfactory.products;

import io.hedwig.dp.demos.creation.abstractfactory.ProductB;

/**
 * 1. author: patrick 2. address: github.com/ideafortester
 */
public class ProductB2 implements ProductB {

  @Override
  public String getDescription() {

    return "this is B2";
  }

  @Override
  public void demoIt() {
    System.out.println("B2");
  }

  @Override
  public String whyB() {
    return "ReasonB2";
  }
}
