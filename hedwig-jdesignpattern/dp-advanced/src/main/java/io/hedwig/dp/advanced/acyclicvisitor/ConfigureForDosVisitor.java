package io.hedwig.dp.advanced.acyclicvisitor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConfigureForDosVisitor implements AllModemVisitor {


  public void visit(Hayes hayes) {
    log.info(hayes + " used with Dos configurator.");
  }

  public void visit(Zoom zoom) {
    log.info(zoom + " used with Dos configurator.");
  }
}
