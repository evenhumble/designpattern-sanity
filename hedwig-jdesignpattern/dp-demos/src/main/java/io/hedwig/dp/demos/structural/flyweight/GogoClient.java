package io.hedwig.dp.demos.structural.flyweight;

/**
 * 1. author: patrick
 */
public class GogoClient {

  public static void main(String[] args) {
    GogoFactory factory = new GogoFactory();
    Gogo black1= factory.getGogo(
        "black"
    );
    for (int i = 0; i < 100; i++) {
      System.out.println(factory.getGogo("black"));
    }
  }
}
