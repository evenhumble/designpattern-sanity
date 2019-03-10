package io.hedwig.dp.demos.structural.proxy;

public class RealSubjectA implements AbstractSubject {

  public void request() {
    System.out.println("real subject A");
  }
}