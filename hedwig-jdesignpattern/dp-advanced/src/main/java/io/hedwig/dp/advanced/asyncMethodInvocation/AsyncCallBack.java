package io.hedwig.dp.advanced.asyncMethodInvocation;

import java.util.Optional;

/**
 * @@author: patrick
 */
public interface AsyncCallBack<T> {
  void onComplete(T value,Optional<Exception> ex);
}
