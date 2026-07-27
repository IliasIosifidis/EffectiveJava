package chapter2.unecessaryObjects;

public class AutoBoxing {
  public static long sum(){
    // Long instead of long "typo"
    Long sum = 0L;
    for (long i = 0; i <= Integer.MAX_VALUE; i++){
      sum += i;
    }
    return sum;
  }
}
