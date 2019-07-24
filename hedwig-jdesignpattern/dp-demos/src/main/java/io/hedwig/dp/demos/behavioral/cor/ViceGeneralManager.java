package io.hedwig.dp.demos.behavioral.cor;

public class ViceGeneralManager extends Leader {

  public ViceGeneralManager(String name) {
    super(name);
  }

  public void handleRequest(LeaveRequest request) {
    if (request.getLeaveDays() < 20) {
      System.out.println(request.getLeaveDays());

    } else {
      if (this.successor != null) {
        this.successor.handleRequest(request);
      }
    }
  }
}