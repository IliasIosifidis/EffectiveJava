package chapter7_LambdasAndStreams.standarFunctionalInterfaces;

import java.util.Map;

public class LinkedMapExample {
//  protected boolean removeEldestEntry(Map.Entry<K,V> eldest){
//    return size() > 100;
//  }

  // Unnecessary functional interface; use a standard one instead.
  @FunctionalInterface interface EldestEntryRemovalFunction<K,V>{
    boolean remove(Map<K,V> map, Map.Entry<K,V> eldest);
  }
}
