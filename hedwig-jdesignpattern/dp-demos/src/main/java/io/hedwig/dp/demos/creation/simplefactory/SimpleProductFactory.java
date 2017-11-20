package io.hedwig.dp.demos.creation.simplefactory;

import com.google.common.collect.Maps;

import java.util.Map;

import io.hedwig.dp.demos.creation.Product;

/**
 * 1. author: patrick
 */
public class SimpleProductFactory {

  static Map<String, Class> productMapping = Maps.newHashMap();

  static {
    productMapping.put("blue", BlueProduct.class);
    productMapping.put("red", RedProduct.class);
    productMapping.put("Yellow", YellowProduct.class);
  }

  /**
   * Create Product
   * @param productName
   * @return
   */
  public static Product create(String productName) {
    Class productClass = productMapping.getOrDefault(productName.toLowerCase(),RedProduct.class);

    try {
      return (Product) productClass.newInstance();
    } catch (InstantiationException | IllegalAccessException e) {
      e.printStackTrace();
      return new RedProduct();
    }
  }

  public static void main(String[] args) {

    Product product = SimpleProductFactory.create("BLUE");
    product.make();
  }
}
