package io.hedwig.dp.demos.structural.flyweight;

/**
 * 1. author: patrick
 */
public abstract class Gogo {
  public abstract String getColor();
  public void display(Coordinate coordinate){
    System.out.println("this is "+getColor()+coordinate.toString());
  }
}
