package chapter8_Methods.overloading;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetList {
  static void main() {
    Set<Integer> set = new TreeSet<>();
    List<Integer> list = new ArrayList<>();

    for (int i = -3; i < 3; i++) {
      set.add(i);
      list.add(i);
    }
    for (int i = 0; i < 3; i++) {
      System.out.println(set +" " + list);
      set.remove(i);
      list.remove(i);
    }
    System.out.println(set +" " + list);
  }
}
