package io.hedwig.dp.demos.behavioral.command;

import java.sql.SQLOutput;

/**
 * @author: patrick on 2019-07-24
 * @Description:
 */
public class ConcreteCommand extends AbstractCommand {

  private CommandStatus status = CommandStatus.PREPARE;
  private final Object lock = new Object();

  public enum CommandStatus {
    PREPARE, PRE_COMMIT, COMMIT, ROLLBACK
  }

  @Override
  public Object execute(Object o) {
    synchronized (lock) {
      status = CommandStatus.PRE_COMMIT;
      System.out.println("current status is " + CommandStatus.PRE_COMMIT);
      System.out.println("execute pre commit");
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println("start to commit status");
      status = CommandStatus.COMMIT;
      System.out.println("commit the status");
      return lock;
    }
  }

  @Override
  public Object undo(Object o) {
    synchronized (lock) {
      status = CommandStatus.ROLLBACK;
      System.out.println("Rolling Back the session");
    }

    return lock;
  }
}
