package io.hedwig.dp.advanced.acyclicvisitor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Zoom extends Modem {
  

  /**
   * Accepts all visitors but honors only ZoomVisitor
   */
  @Override
  public void accept(ModemVisitor modemVisitor) {
    if (modemVisitor instanceof  ZoomVisitor) {
      ((ZoomVisitor) modemVisitor).visit(this);
    } else {
      log.info("Only ZoomVisitor is allowed to visit Zoom modem");
    }
  }
  
  /**
   * Zoom modem's toString
   * method
   */
  @Override
  public String toString() {
    return "Zoom modem";
  }
}