package io.hedwig.dp.demos.behavioral.cor;

public class Manager extends Leader {

  public Manager(String name) {
    super(name);
  }

  public void handleRequest(LeaveRequest request) {
    if (request.getLeaveDays() < 10) {
      System.out.println(
          "this" + name + "that" + request.getLeaveName() + "leave_name" + request
              .getLeaveDays() + "days");
    } else {
      if (this.successor != null) {
        this.successor.handleRequest(request);
      }
    }
  }
}