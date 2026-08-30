package chapter11_Concurrency.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorSer {
  static void main() {
    ExecutorService executorService = Executors.newSingleThreadExecutor();
    Runnable runnable = null;
    executorService.execute(runnable);
    executorService.shutdown();
  }
}
