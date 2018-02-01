package io.hedwig.dp.advanced.databus.data;

import io.hedwig.dp.advanced.databus.AbstractDataType;
import io.hedwig.dp.advanced.databus.DataType;

public class MessageData extends AbstractDataType {

  private final String message;

  public MessageData(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public static DataType of(final String message) {
    return new MessageData(message);
  }
}