package io.hedwig.dp.advanced.abstractdocument.domain;

import java.util.Map;

import io.hedwig.dp.advanced.abstractdocument.core.AbstractDocument;

/**
 * @@author: patrick
 */
public class Car extends AbstractDocument implements HasModel, HasPrice, HasParts {

  public Car(Map<String, Object> properties) {
    super(properties);
  }

}

