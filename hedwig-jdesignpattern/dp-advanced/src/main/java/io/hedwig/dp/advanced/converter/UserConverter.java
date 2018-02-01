package io.hedwig.dp.advanced.converter;

import java.util.function.Function;

/**
 * @@author: patrick
 */
public class UserConverter extends Converter<UserDto,UserEntity> {

  public UserConverter(){
    super(userDto -> new UserEntity(
        userDto.getFirstName(),userDto.getFirstName(),
        userDto.isActive()
    ), userEntity -> new UserDto(
        userEntity.getFirstName(),userEntity.getLastName(),
        "test@163.com"
        ));
  }
}
