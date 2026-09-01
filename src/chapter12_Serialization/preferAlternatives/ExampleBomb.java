package chapter12_Serialization.preferAlternatives;

import java.util.HashSet;
import java.util.Set;

public class ExampleBomb {
  // Deserialization bomb - deserializing this stream takes forever
  static byte[] bomb(){
    Set<Object> root = new HashSet<>();
    Set<Object> s1 = root;
    Set<Object> s2 = new HashSet<>();
    for (int i = 0; i < 100; i++) {
      Set<Object> t1 = new HashSet<>();
      Set<Object> t2 = new HashSet<>();
      t1.add("food"); // make t1 = t2
      s1.add(t1); s1.add(t2);
      s2.add(t1); s2.add(t2);
      s1 = t1;
      s2 = t2;
    }
    return new byte[10]; // a random return
//    return serialize(root); // Method omitted for brevity
  }
}
