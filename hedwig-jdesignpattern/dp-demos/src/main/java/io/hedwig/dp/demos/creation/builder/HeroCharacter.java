package io.hedwig.dp.demos.creation.builder;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 1. author: patrick
 */
@ToString
@AllArgsConstructor
public class HeroCharacter {
  private String name;
  private final Weapon weapon;

  public HeroCharacter(Builder builder) {
    this.name=builder.name;
    this.weapon = builder.weapon;
  }

  public String getName() {
    return name;
  }

  public Weapon getWeapon() {
    return weapon;
  }
   @NoArgsConstructor
   public static class Builder{
    private Weapon weapon;
    private String name;

    public Builder name(String name){
      this.name=name;
      return this;
    }
    public Builder withWeapon(Weapon weapon){
      this.weapon=weapon;
      return this;
    }

    public HeroCharacter build(){
      return new HeroCharacter(this);
    }
   }
}
