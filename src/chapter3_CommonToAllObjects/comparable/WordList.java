package chapter3_CommonToAllObjects.comparable;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class WordList {
  static void main(String[] args) {
    Set<String> stringSet = new TreeSet<>();
    Collections.addAll(stringSet, args);
    IO.println(stringSet);
  }
}
