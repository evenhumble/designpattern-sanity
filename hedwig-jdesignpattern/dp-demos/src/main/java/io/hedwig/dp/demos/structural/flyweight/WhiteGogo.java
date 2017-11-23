package io.hedwig.dp.demos.structural.flyweight;

/**
 * 1. author: patrick
 */
public class WhiteGogo extends Gogo {

  @Override
  public String getColor(){
    return "white";
  }

  public void display(){
    System.out.println("this is "+getColor());
  }
}
