package io.hedwig.dp.demos.structural.template;

public abstract class HookDemo {

  public abstract void getData();

  public void convertData() {
    System.out.println("converting data");
  }

  public abstract void displayData();

  public void process() {
    getData();
    if (isValid()) {
      convertData();
    }
    displayData();
  }

  public boolean isValid() {
    return true;
  }
} 