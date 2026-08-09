package chapter5_Generics.favorGenericMethods;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetsExample {
  // Simple program to exercise generic method
  static void main() {
    Set<String> guys = Set.of("Tom","Albus", "Harry");
    Set<String> girls = Set.of("Dianna", "Octavia", "Jannet");
    Set<String> couples = unionE(guys, girls);
    Set<Integer> integers = Set.of(1, 3, 5);
    Set<Double> doubles = Set.of(2.0, 4.0, 6.0);
    Set<Number> numbers = SetsExample.<Number>unionE(integers,doubles);
    System.out.println(couples);
  }
  // Use raw types - unacceptable!
  public static Set union(Set s1, Set s2){
    Set result = new HashSet(s1);
    result.addAll(s2);
    return result;
  }
  // Generic method
  public static <E> Set<E> unionE(Set<? extends E> s1, Set<? extends E> s2){
    Set<E> result = new HashSet<>(s1);
    result.addAll(s2);
    return result;
  }

  // Two possible declarations for the swap method
//  public static <E> void swap(List<E> list, int i, int j) {}
//  public static void swap(List<?> list, int i, int j){}
//  public static void swap(List<?> list, int i, int j){
//    list.set(i, list.set(j, list.get(i)));
//  }
  // Private helper method for wildcard capture
  private static <E> void swapHelper(List<E> list, int i, int j){
    list.set(i, list.set(j, list.get(i)));
  }
}
