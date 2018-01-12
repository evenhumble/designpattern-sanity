package io.hedwig.dp.advanced.callback;

/**
 * @@author: patrick
 */
public abstract class Task {
  public final void executeWith(CallBack...callBacks){
    execute();
    if(callBacks!=null){
      for (CallBack callBack : callBacks) {
        callBack.call();
      }
    }
  }

  public abstract void execute();
}
