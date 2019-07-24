package io.hedwig.dp.demos.behavioral.command;

/**
 * @author: patrick on 2019-07-24
 * @Description:
 */
public abstract class AbstractCommand {
  public abstract Object execute(Object o);
  public abstract Object undo(Object o);
}
