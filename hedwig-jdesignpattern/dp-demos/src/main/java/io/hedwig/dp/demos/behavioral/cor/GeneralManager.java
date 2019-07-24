package io.hedwig.dp.demos.behavioral.cor;

public class GeneralManager extends Leader {

  public GeneralManager(String name) {
    super(name);
  }

  public void handleRequest(LeaveRequest request) {
    if (request.getLeaveDays() < 30) {
      System.out.println(request.getLeaveDays());

    } else {
      System.out.println(request.getLeaveDays());
    }
  }
}