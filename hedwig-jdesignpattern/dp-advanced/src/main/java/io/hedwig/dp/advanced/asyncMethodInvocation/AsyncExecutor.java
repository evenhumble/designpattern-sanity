package io.hedwig.dp.advanced.asyncMethodInvocation;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/**
 * @@author: patrick
 */
public interface AsyncExecutor {

  <T> AsyncResult<T> startProcess(Callable<T> task);

  <T> AsyncResult<T> startProcess(Callable<T> task, AsyncCallBack<T> callback);

  <T> T endProcess(AsyncResult<T> asyncResult) throws ExecutionException, InterruptedException;
}
