package io.hedwig.dp.demos.creation.abstractfactory.factory;

import io.hedwig.dp.demos.creation.abstractfactory.ProductA;
import io.hedwig.dp.demos.creation.abstractfactory.ProductB;
import io.hedwig.dp.demos.creation.abstractfactory.ProductFactory;
import io.hedwig.dp.demos.creation.abstractfactory.products.ProductAB;
import io.hedwig.dp.demos.creation.abstractfactory.products.ProductB2;

/**
 * 1. author: patrick 2. address: github.com/ideafortester
 */
public class QuantityFirstFactory implements ProductFactory {

  @Override
  public ProductA createA() {
    return new ProductAB();
  }

  @Override
  public ProductB createB() {
    return new ProductB2();
  }
}
