package io.hedwig.dp.demos.creation.abstractfactory.factory;

import io.hedwig.dp.demos.creation.abstractfactory.ProductA;
import io.hedwig.dp.demos.creation.abstractfactory.ProductB;
import io.hedwig.dp.demos.creation.abstractfactory.ProductFactory;
import io.hedwig.dp.demos.creation.abstractfactory.products.ProductA1;
import io.hedwig.dp.demos.creation.abstractfactory.products.ProductB1;

/**
 * 1. author: patrick 2. address: github.com/ideafortester
 */
public class HighEndFactory implements ProductFactory {

  @Override
  public ProductA createA() {
    return new ProductA1();
  }

  @Override
  public ProductB createB() {
    return new ProductB1();
  }
}
