package io.hedwig.dp.advanced.converter;

import lombok.Data;

/**
 * @@author: patrick
 */
@Data
public class UserDto {
  private String firstName;
  private String lastName;
  private boolean isActive;
  private String email;

  public UserDto(String firstName, String lastName, String email) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
  }
}
