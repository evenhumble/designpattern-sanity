package io.hedwig.dp.demos.behavioral.observer;

public class Cat extends MySubject {

  public void cry() {
    System.out.println("this is cat crying");
    System.out.println("----------------------------");

    for (Object obs : observers) {
      ((MyObserver) obs).response();
    }

  }
}