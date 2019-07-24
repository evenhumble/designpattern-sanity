package io.hedwig.dp.demos.structural.template;

public class SubHookDemo extends HookDemo {

  public void getData() {
    System.out.println("getting data");
  }

  public void displayData() {
    System.out.println("display data");
  }

  public boolean isValid() {
    return false;
  }
}