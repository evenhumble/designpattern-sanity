package io.hedwig.dp.demos.creation.builder;

/**
 * 1. author: patrick
 */
public class HeroClient {

  public static void main(String[] args) {

    HeroCharacter hc= new HeroCharacter.Builder().name("this")
        .withWeapon(new Weapon()).build();
    System.out.println(hc);
  }
}
