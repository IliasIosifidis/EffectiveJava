package chapter11_Concurrency.documentThreadSafety;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ExampleDocument <K,V> {
  Map<K,V> kvMap = Collections.synchronizedMap(new HashMap<>());
  Set<K> kSet = kvMap.keySet(); // Need no sync block

//  synchronized(kvMap){ // synchronizing on m, not s!
//    for (K key : kSet){
//      key.toString();
//    }
//  }

  private final Object lock = new Object();
  void food(){
    synchronized (lock){
    }
  }
}
