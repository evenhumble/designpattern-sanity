package io.hedwig.dp.advanced.balking;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @@author: patrick
 */
public class BalkingMain {

  public static void main(String[] args) throws InterruptedException {
    final WashMachine washMachine = new WashMachine();
    washMachine.powerOn();
    ExecutorService es = Executors.newFixedThreadPool(3);
    for (int i = 0; i < 3; i++) {
      es.execute(washMachine::wash);
    }

    es.shutdown();
    es.awaitTermination(2000L, TimeUnit.MILLISECONDS);
  }
}
