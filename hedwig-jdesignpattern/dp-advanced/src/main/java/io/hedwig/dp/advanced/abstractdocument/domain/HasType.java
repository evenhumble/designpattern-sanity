package io.hedwig.dp.advanced.abstractdocument.domain;

import java.util.Optional;

import io.hedwig.dp.advanced.abstractdocument.core.DHDocument;

/**
 * @@author: patrick
 */
public interface HasType extends DHDocument {

  String PROPERTY = "type";

  default Optional<String> getType() {
    return Optional.ofNullable((String) get(PROPERTY));
  }
}
