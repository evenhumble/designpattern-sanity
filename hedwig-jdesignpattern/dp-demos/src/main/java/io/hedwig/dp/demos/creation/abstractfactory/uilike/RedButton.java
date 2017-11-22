package io.hedwig.dp.demos.creation.abstractfactory.uilike;

/**
 * 1. author: patrick
 */
public class RedButton implements Button {

  @Override
  public void display() {
    System.out.println("this is red");
  }
}
