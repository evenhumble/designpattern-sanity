package io.hedwig.dp.demos.behavioral.observer;

public class Mouse implements MyObserver {

  public void response() {
    System.out.println("mouse response");
  }
}