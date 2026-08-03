package chapter2_CreatingAndDestroyingObjects.unecessaryObjects;

public class AutoBoxing {
  private static long sum(){
    // Long instead of long "typo"
    Long sum = 0L;
    for (long i = 0; i <= Integer.MAX_VALUE; i++){
      sum += i;
    }
    return sum;
  }
}
