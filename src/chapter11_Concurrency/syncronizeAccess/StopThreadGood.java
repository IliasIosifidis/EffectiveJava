package chapter11_Concurrency.syncronizeAccess;

import java.util.concurrent.TimeUnit;

// Properly synchronized cooperative thread termination
public class StopThreadGood {
  public static boolean stopRequested;

  private static synchronized void requestStop(){
    stopRequested = true;
  }
  private static synchronized boolean stopRequested(){
    return stopRequested;
  }

  static void main() throws InterruptedException {
    Thread backgroundThread = new Thread(() -> {
      int i = 0;
      while (!stopRequested()) {
        i++;
      }
    });
    backgroundThread.start();
    TimeUnit.SECONDS.sleep(1);
    requestStop();
  }
}
