package io.hedwig.dp.advanced.databus;

import java.util.function.Consumer;

/**
 * @@author: patrick
 */
public interface Member extends Consumer<DataType> {

  void accept(DataType event);
}
