package io.hedwig.dp.demos.structural.flyweight;

/**
 * 1. author: patrick
 */
public class BlackGogo extends Gogo {

  @Override
  public String getColor() {
    return "black";
  }

  public void display(Coordinate coordinate){
    System.out.println("this is "+getColor()+"location:"+coordinate.toString());
  }
}
