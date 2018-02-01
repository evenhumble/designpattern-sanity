package io.hedwig.dp.advanced.converter;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @@author: patrick
 */
public class Converter<T, U> {

  private final Function<T, U> fromDTO;
  private final Function<U, T> fromEntity;

  public Converter(Function<T, U> fromDTO, Function<U, T> fromEntity) {
    this.fromDTO = fromDTO;
    this.fromEntity = fromEntity;
  }

  public U convertFromDto(final T dto) {
    return fromDTO.apply(dto);
  }

  public T convertFromEntity(final U entity) {
    return fromEntity.apply(entity);
  }

  public List<U> createFromDtos(Collection<T> dtos) {
    return dtos.stream().map(this::convertFromDto)
        .collect(Collectors.toList());
  }


  public List<T> createFromEntities(Collection<U> entities) {
    return entities.stream().map(this::convertFromEntity)
        .collect(Collectors.toList());
  }
}
