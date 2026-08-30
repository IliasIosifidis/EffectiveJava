package chapter11_Concurrency.concurrencyToWait;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

public class SimpleExecution {
  public static long time(Executor executor, int concurrency, Runnable action) throws InterruptedException {
    CountDownLatch ready = new CountDownLatch(concurrency);
    CountDownLatch start = new CountDownLatch(1);
    CountDownLatch done = new CountDownLatch(concurrency);

    for (int i = 0; i < concurrency; i++) {
      executor.execute(() -> {
        ready.countDown(); // Start the timer
        try {
          start.await();
          action.run();
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        } finally {
          done.countDown();
        }
      });
    }
    ready.await(); // Wait for the workers to be ready
    long startNanos = System.nanoTime();
    start.countDown(); // And they are off!
    done.await(); // Wait for all workers to finish
    return System.nanoTime() - startNanos;
  }
}
