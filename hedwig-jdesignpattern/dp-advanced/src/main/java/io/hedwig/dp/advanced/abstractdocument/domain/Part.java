package io.hedwig.dp.advanced.abstractdocument.domain;

import java.util.Map;

import io.hedwig.dp.advanced.abstractdocument.core.AbstractDocument;

/**
 * @@author: patrick
 */
public class Part extends AbstractDocument implements HasPrice,HasType,HasModel {

  public Part(Map<String, Object> properties) {
    super(properties);
  }
}
