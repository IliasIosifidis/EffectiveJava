package chapter9_GeneralProgramming.stringConcat;

public class Statement {
  // Inappropriate use of string concatenation - Performs poorly
  static void main() {
    String result = "";
    for (int i = 0; i < 100000; i++) {
      result += "result of: " + i;
    }
    System.out.println(result);

    // String builder meanwhile
  StringBuilder result2 = new StringBuilder();
    for (int i = 0; i < 100000; i++) {
    result2.append("result of: ");
    result2.append(i);
  }
    System.out.println(result2);
  }
}
