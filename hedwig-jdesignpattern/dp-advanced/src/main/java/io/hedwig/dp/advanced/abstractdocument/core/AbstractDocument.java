package io.hedwig.dp.advanced.abstractdocument.core;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @@author: patrick
 */
public abstract class AbstractDocument implements DHDocument {


  private final Map<String, Object> properties;

  public AbstractDocument(Map<String, Object> properties) {
    Objects.requireNonNull(properties,"properties map should be not null");
    this.properties = properties;
  }

  @Override
  public void put(String key, Object value) {
    properties.put(key,value);
  }

  @Override
  public Object get(String key) {
    return properties.get(key);
  }

  @Override
  public <T> Stream<T> children(String key, Function<Map<String, Object>, T> constructor) {
    Optional<List<Map<String,Object>>> any = Stream.of(get(key))
        .filter(Objects::nonNull)
        .map(ele->(List<Map<String,Object>>)ele).findAny();
    return any.isPresent()?any.get().stream().map(constructor):Stream.empty();
  }

  @Override
  public String toString() {
    return "AbstractDocument{" +
           "properties=" + properties +
           '}';
  }
}
