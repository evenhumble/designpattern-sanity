package io.hedwig.dp.demos.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. author: patrick
 */
public class GogoFactory {
  private static Map<String,Gogo> gogoContainer = new HashMap<>();
  static {
    gogoContainer.put("black",new BlackGogo());
    gogoContainer.put("white",new WhiteGogo());
  }

  public Gogo getGogo(String color){
    return gogoContainer.get(color);
  }
}
