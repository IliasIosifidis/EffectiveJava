package chapter6_EnumsAndAnnotations.enumsInsteadOfInts;

public enum Operation {
  PLUS, MINUS, TIMES, DIVIDE;

  //Do the arithmetic operation represented by this constant
  public double apply(double x, double y) {
    return switch (this) {
      case PLUS -> x + y;
      case MINUS -> x - y;
      case TIMES -> x * y;
      case DIVIDE -> x / y;
    };
  }
}
