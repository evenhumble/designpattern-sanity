package io.hedwig.dp.advanced.databus.data;

import java.time.LocalDateTime;

import io.hedwig.dp.advanced.databus.AbstractDataType;
import io.hedwig.dp.advanced.databus.DataType;

public class StartingData extends AbstractDataType {

  private final LocalDateTime when;

  public StartingData(LocalDateTime when) {
    this.when = when;
  }

  public LocalDateTime getWhen() {
    return when;
  }

  public static DataType of(final LocalDateTime when) {
    return new StartingData(when);
  }
}