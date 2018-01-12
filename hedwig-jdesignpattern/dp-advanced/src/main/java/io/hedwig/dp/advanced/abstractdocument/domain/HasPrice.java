package io.hedwig.dp.advanced.abstractdocument.domain;

import java.util.Optional;

import io.hedwig.dp.advanced.abstractdocument.core.DHDocument;

/**
 * @@author: patrick
 */
public interface HasPrice extends DHDocument {

  String PROPERTY = "price";

  default Optional<Number> getPrice() {
    return Optional.ofNullable((Number) get(PROPERTY));
  }
}
