package chapter5_Generics.favorGenericMethods;

import java.util.HashSet;
import java.util.Set;
import java.util.function.UnaryOperator;

public class SetsExample {
  // Simple program to exercise generic method
  static void main() {
    Set<String> guys = Set.of("Tom","Albus", "Harry");
    Set<String> girls = Set.of("Dianna", "Octavia", "Jannet");
    Set<String> couples = unionE(guys, girls);
    System.out.println(couples);
  }
  // Use raw types - unacceptable!
  public static Set union(Set s1, Set s2){
    Set result = new HashSet(s1);
    result.addAll(s2);
    return result;
  }
  // Generic method
  public static <E> Set<E> unionE(Set<E> s1, Set<E> s2){
    Set<E> result = new HashSet<>(s1);
    result.addAll(s2);
    return result;
  }

}
