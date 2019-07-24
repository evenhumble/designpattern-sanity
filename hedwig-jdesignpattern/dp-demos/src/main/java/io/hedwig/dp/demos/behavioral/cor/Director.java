package io.hedwig.dp.demos.behavioral.cor;

public class Director extends Leader {

  public Director(String name) {
    super(name);
  }

  public void handleRequest(LeaveRequest request) {
    if (request.getLeaveDays() < 3) {
      System.out.println(
          "this is" + name + "naming" + request.getLeaveName() + "request" + request
              .getLeaveDays() + "leave days");
    } else {
      if (this.successor != null) {
        this.successor.handleRequest(request);
      }
    }
  }
}