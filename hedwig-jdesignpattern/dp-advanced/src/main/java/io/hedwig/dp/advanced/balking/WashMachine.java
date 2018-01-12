package io.hedwig.dp.advanced.balking;

import lombok.extern.slf4j.Slf4j;

/**
 * @@author: patrick
 */
@Slf4j
public class WashMachine {

  private WashMachineState washMachineState = WashMachineState.POWER_OFF;

  public void powerOff() {
    this.washMachineState=WashMachineState.POWER_OFF;
  }

  public void powerOn() throws InterruptedException {
    if(this.washMachineState==WashMachineState.POWER_OFF){
      this.washMachineState=WashMachineState.POWER_ON;
      Thread.sleep(1000L);
      this.washMachineState = WashMachineState.STANDBY;
    }
  }

  public void wash() {
    synchronized (this) { // for remote controller
      if (washMachineState != WashMachineState.STANDBY) {
        throw new RuntimeException("Please change to STANDBY state to wash");
      }

      this.washMachineState = WashMachineState.WASHING;
    }
  }

  public void stop() {
    if(washMachineState!=WashMachineState.POWER_OFF){
      this.washMachineState = WashMachineState.STANDBY;
    }
  }

  public void completeWashing(){
    washMachineState=WashMachineState.STANDBY;
  }
}
