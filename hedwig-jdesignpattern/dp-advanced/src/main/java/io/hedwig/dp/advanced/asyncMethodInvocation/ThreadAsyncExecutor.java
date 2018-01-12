package io.hedwig.dp.advanced.asyncMethodInvocation;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @@author: patrick
 */
public class ThreadAsyncExecutor implements AsyncExecutor {

  private final AtomicInteger idx = new AtomicInteger(0);

  @Override
  public <T> AsyncResult<T> startProcess(Callable<T> task) {
    return startProcess(task, null);
  }

  @Override
  public <T> AsyncResult<T> startProcess(Callable<T> task, AsyncCallBack<T> callback) {
    CompletableResult<T> result = new CompletableResult<>(callback);
    new Thread(() -> {
      try {
        result.setValue(task.call());
      } catch (Exception ex) {
        result.setException(ex);
      }
      ;
    }, "executor-" + idx.incrementAndGet()).start();
    return result;
  }

  @Override
  public <T> T endProcess(AsyncResult<T> asyncResult)
      throws ExecutionException, InterruptedException {

    if (!asyncResult.isCompleted()) {
      asyncResult.await();
    }
    return asyncResult.getValue();
  }
}
