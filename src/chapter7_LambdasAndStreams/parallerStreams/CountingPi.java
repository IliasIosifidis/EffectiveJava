package chapter7_LambdasAndStreams.parallerStreams;

import java.math.BigInteger;
import java.util.stream.LongStream;

public class CountingPi {
  static void main() {
    long now = System.currentTimeMillis();
    pi(50000000);
    System.out.println(System.currentTimeMillis() - now);

    long then = System.currentTimeMillis();
    pirallel(500000000);
    System.out.println(System.currentTimeMillis() - then);
  }
  // Prime-counting stream pipeline - benefits from parallelization
  static long pi(long n){
    return LongStream.rangeClosed(2,n)
            .mapToObj(BigInteger::valueOf)
            .filter(i -> i.isProbablePrime(50))
            .count();
  }
  static long pirallel(long n){
    return LongStream.rangeClosed(2,n)
            .parallel()
            .mapToObj(BigInteger::valueOf)
            .filter(i -> i.isProbablePrime(50))
            .count();
  }
}
