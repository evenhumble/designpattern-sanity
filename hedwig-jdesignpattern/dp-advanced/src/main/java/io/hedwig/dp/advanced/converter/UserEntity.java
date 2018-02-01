package io.hedwig.dp.advanced.converter;

import lombok.Data;

/**
 * @@author: patrick
 */
@Data
public class UserEntity {
  private String userId;
  private String firstName;
  private String lastName;
  private boolean isActive;

  public UserEntity(String firstName, String lastName, boolean isActive) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.isActive = isActive;
  }
}
