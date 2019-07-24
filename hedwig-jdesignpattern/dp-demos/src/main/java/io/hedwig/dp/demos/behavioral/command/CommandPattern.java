package io.hedwig.dp.demos.behavioral.command;

/**
 * @author: patrick on 2019-07-24
 * @Description:
 */
public class CommandPattern {

    private AbstractCommand command;


  public CommandPattern(AbstractCommand command) {
    this.command = command;
  }

  public void doTxn(Object o){
    try{
      command.execute(o);
    }catch (Exception e){
      command.undo(o);
    }
  }

  public static void main(String[] args) {
    CommandPattern pattern = new CommandPattern(new ConcreteCommand());
    pattern.doTxn(new Object());

  }
}
