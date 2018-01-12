package io.hedwig.dp.advanced.asyncMethodInvocation;

import java.util.concurrent.ExecutionException;

/**
 * @@author: patrick
 */
public interface AsyncResult<T> {
  boolean isCompleted();
  T getValue() throws ExecutionException;
  void await() throws InterruptedException;
}
