package chapter7_LambdasAndStreams.methodRefOverLambdas;

import java.util.HashMap;
import java.util.Map;

public class ExampleMap {
  static void main() {
    Map<Integer, Integer> map = new HashMap<>();
    map.put(1,2);
    map.put(2,3);
    Integer key = 10;
    map.merge(key, 1, (count, incr)-> count + incr);
    map.merge(key, 1, Integer::sum);
  }
}
