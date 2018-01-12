package io.hedwig.dp.advanced.abstractdocument.domain;

import java.util.Optional;

import io.hedwig.dp.advanced.abstractdocument.core.DHDocument;

/**
 * @@author: patrick
 */
public interface HasModel extends DHDocument{
  String PROPERTY="model";
  default Optional<String> getModel(){
    return Optional.ofNullable((String) get(PROPERTY));
  }
}
