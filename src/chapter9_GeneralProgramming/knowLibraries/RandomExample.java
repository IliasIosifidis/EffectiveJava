package chapter9_GeneralProgramming.knowLibraries;

import java.util.Random;
public class RandomExample {
  // Common but deeply flawed!
  static Random rnd = new Random();
  static int random(int n){
    return Math.abs(rnd.nextInt()) % n;
  }

  static void main() {
    System.out.println(random(4));

    // 2nd example
    int n = 2 *(Integer.MAX_VALUE / 3);
    int low = 0;
    for (int i = 0; i < 1_000_000; i++){
      if (random(n) < n/2){
        low++;
      }
    }
    System.out.println(low);
  }
}
