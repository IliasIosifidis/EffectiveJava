package chapter10_Exceptions.eceptionalConditions;

import java.util.ArrayList;
import java.util.Collection;

// Horrible abuse of exceptions
public class BadExample {
  static Collection collection = new ArrayList<>();

  static void main() {
    try {
//      int i = 0;
      while (true) {
//        range[i++].climb();
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      throw new RuntimeException(e);
    }
  }
}
