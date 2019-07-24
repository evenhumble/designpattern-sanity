package io.hedwig.dp.demos.behavioral.cor;

public class Client {

  public static void main(String args[]) {
    Leader objDirector, objManager, objGeneralManager, objViceGeneralManager;

    objDirector = new Director("director");
    objManager = new Manager("manager");
    objGeneralManager = new GeneralManager("GM");
    objViceGeneralManager = new ViceGeneralManager("ViceGM");

    objDirector.setSuccessor(objManager);
    objManager.setSuccessor(objViceGeneralManager);
    objViceGeneralManager.setSuccessor(objGeneralManager);

    LeaveRequest lr1 = new LeaveRequest("level1", 2);
    objDirector.handleRequest(lr1);

    LeaveRequest lr2 = new LeaveRequest("level2", 5);
    objDirector.handleRequest(lr2);

    LeaveRequest lr3 = new LeaveRequest("level3", 15);
    objDirector.handleRequest(lr3);

    LeaveRequest lr4 = new LeaveRequest("level4", 25);
    objDirector.handleRequest(lr4);
  }
}