package chapter7_LambdasAndStreams.lambdasOverAnonymous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparingInt;

public class Anonymous {
  static void main() {
    List<String> words = new ArrayList<>();
    Collections.addAll(words,"one", "two", "three", "four");

    // Anonymous
    Collections.sort(words, new Comparator<String>() {
      @Override
      public int compare(String s1, String s2) {
        return Integer.compare(s1.length(), s2.length());
      }
    });

    // Lambdas
    Collections.sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
    Collections.sort(words, comparingInt(String::length));
    words.sort(comparingInt(String::length));
  }
}


