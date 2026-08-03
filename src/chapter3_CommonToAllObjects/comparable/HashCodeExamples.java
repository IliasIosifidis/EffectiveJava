package chapter3_CommonToAllObjects.comparable;

import java.util.Comparator;

// ΒΡΟΚΕΝ difference-based comparator - violates transitivity!
public class HashCodeExamples {
  static Comparator<Object> hashCodeOrder = new Comparator<>(){
    public int compare(Object o1, Object o2){
      return o1.hashCode() - o2.hashCode();
    }
  };

  // Comparator based on static compare method
  static Comparator<Object> hashCodeOrder2 = new Comparator<>(){
    public int compare(Object o1, Object o2){
      return Integer.compare(o1.hashCode(), o2.hashCode());
    }
  };

  // Comparator based on Comparator construction method
  static Comparator<Object> hasCodeOrder3 =
          Comparator.comparingInt(o -> o.hashCode());
}