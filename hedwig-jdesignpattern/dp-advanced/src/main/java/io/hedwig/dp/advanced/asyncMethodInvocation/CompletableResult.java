package io.hedwig.dp.advanced.asyncMethodInvocation;

import java.util.Optional;
import java.util.concurrent.ExecutionException;

/**
 * @@author: patrick
 */
public class CompletableResult<T> implements AsyncResult<T> {

  static final int RUNNING = 1;
  static final int FAILED = 2;
  static final int COMPLETED = 3;
  volatile int state = RUNNING;
  T value;
  Exception exception;

  final Object lock;
  final Optional<AsyncCallBack<T>> callback;

  public CompletableResult(AsyncCallBack<T> callback) {
    this.lock = new Object();
    this.callback = Optional.ofNullable(callback);
  }

  void setValue(T value) {
    this.value = value;
    this.state = COMPLETED;
    this.callback.ifPresent(ac -> ac.onComplete(value, Optional.<Exception>empty()));
    synchronized (lock) {
      lock.notifyAll();
    }
  }
  void setException(Exception exception) {
    this.exception = exception;
    this.state = FAILED;
    this.callback.ifPresent(ac -> ac.onComplete(null, Optional.of(exception)));
    synchronized (lock) {
      lock.notifyAll();
    }
  }

  @Override
  public boolean isCompleted() {
    return false;
  }

  @Override
  public T getValue() throws ExecutionException {
    if (state == COMPLETED) {
      return value;
    } else if (state == FAILED) {
      throw new ExecutionException(exception);
    } else {
      throw new IllegalStateException("Execution not completed yet");
    }
  }

  @Override
  public void await() throws InterruptedException {
    synchronized (lock) {
      while (!isCompleted()) {
        lock.wait();
      }
    }
  }
}
