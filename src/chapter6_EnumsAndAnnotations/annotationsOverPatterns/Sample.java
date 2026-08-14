package chapter6_EnumsAndAnnotations.annotationsOverPatterns;

public class Sample {
  @Test
  public static void m1(){} // test should pass

  public static void m2(){}

  @Test
  public static void m3(){throw new RuntimeException("loooooser!");}

  public static void m4(){}

  @Test
  public static void m5(){} // invalid use: non-static method

  public static void m6(){}

  @Test
  public static void m7(){throw new RuntimeException("wtvr");}

  public static void m8(){};
}

