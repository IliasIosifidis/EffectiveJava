package chapter11_Concurrency.syncronizeAccess;

import java.util.concurrent.atomic.AtomicLong;

public class AtomicLonging {
  private static final AtomicLong nextSerialNum = new AtomicLong();
  public static long generateSerialNumber(){
    return nextSerialNum.getAndIncrement();
  }
}
