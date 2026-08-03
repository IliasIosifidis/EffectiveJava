package chapter2_CreatingAndDestroyingObjects.unecessaryObjects;

import java.util.regex.Pattern;

public class RomanNumerals {

  // Performance can be greatly improved!
  static boolean isRomanNumeralWrong(String s) {
    return s.matches("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
  }
  private static final Pattern ROMAN = Pattern.compile(
          "^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$"
  );
  static boolean isRomanNumeral(String s){
    return ROMAN.matcher(s).matches();
  }
}
