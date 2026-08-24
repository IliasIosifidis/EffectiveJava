package chapter9_GeneralProgramming.preferPrimitives;

import java.util.Comparator;

public class ExampleBoxing {
  static void main() {
    // Broken comparator - can you spot the flaw?
    Comparator<Integer> naturalOrder =
            (i, j) -> (i < j) ? -1 : (i == j ? 0 : 1);

    Comparator<Integer> naturalOrder2 = (iBoxed, jBoxed) -> {
      int i = iBoxed, j = jBoxed; // Auto-unboxing
      return i < j ? -1 : (i == j ? 0 : 1);
    };

    // Other example
    Integer l = 0;
    if (l == 42){
      System.out.println("Unbelievable");
    }
  }
}
