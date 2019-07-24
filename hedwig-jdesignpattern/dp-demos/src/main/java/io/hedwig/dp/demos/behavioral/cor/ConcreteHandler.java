package io.hedwig.dp.demos.behavioral.cor;

public class ConcreteHandler extends Handler {

  public void handleRequest(String request) {
    if (request == null) {
      System.out.println("going to fail over request");
    } else {
      this.successor.handleRequest(request);
    }
  }
}