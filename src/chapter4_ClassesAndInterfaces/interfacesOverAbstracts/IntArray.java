package chapter4_ClassesAndInterfaces.interfacesOverAbstracts;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IntArray {
  static List<Integer> integerList(int[] a){
    Objects.requireNonNull(a);

    // The diamond operator is only legal heere in Java 9 and later
    // If you are using an earlier release, specify <Integer>
    return new ArrayList<>(){
      @Override public Integer get(int i){
        return a[i]; // Autoboxing
      }

      @Override public Integer set(int i, Integer val){
        int oldVal = a[i];
        a[i] = val; // Auto-unboxing
        return oldVal; // Autoboxing
      }

      @Override public int size(){
        return a.length;
      }
    };
  }
}
