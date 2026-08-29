package chapter11_Concurrency.syncronizeAccess;

import java.util.concurrent.TimeUnit;

// Cooperative thread termination with a volatile field
public class StopThreadBetter {
  private static volatile boolean stopRequested;

  static void main() throws InterruptedException {
    Thread backgroundThread = new Thread(()->{
      int i = 0;
      while (!stopRequested){
        i++;
      }
    });
    backgroundThread.start();
    TimeUnit.SECONDS.sleep(1);
    stopRequested = true;
  }
}
