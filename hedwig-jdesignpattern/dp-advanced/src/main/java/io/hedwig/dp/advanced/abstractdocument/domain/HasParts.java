package io.hedwig.dp.advanced.abstractdocument.domain;

import java.util.stream.Stream;

import io.hedwig.dp.advanced.abstractdocument.core.DHDocument;

/**
 * @@author: patrick
 */
public interface HasParts extends DHDocument {

  String PROPERTY = "parts";

  default Stream<Part> getParts() {
    return children(PROPERTY, Part::new);
  }
}
