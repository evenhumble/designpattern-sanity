package io.hedwig.dp.advanced.acyclicvisitor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConfigureForUnixVisitor implements ZoomVisitor {


  public void visit(Zoom zoom) {
    log.info(zoom + " used with Unix configurator.");
  }
}