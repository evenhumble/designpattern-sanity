package io.hedwig.dp.demos.structural.facade;

/**
 * 1. author: patrick
 */
public class Facade {

  private SubSysB subSysB = new SubSysB();
  private SubSysA subSysA = new SubSysA();
  private SubSysAB subSysAB = new SubSysAB();
  private SubSysC subSysC = new SubSysC();

  public void subAandSubB() {
    this.subSysA.operateA();
    this.subSysB.operateB();
  }
  public void subAandSubAB() {
    this.subSysA.operateA();
    this.subSysAB.operateB();
  }
}
