import chapter6_EnumsAndAnnotations.annotationsOverPatterns.ExceptionTest;

// Code containing an annotation with an array parameter

@ExceptionTest(IndexOutOfBoundsException.class)
@ExceptionTest(NullPointerException.class)
public static void doublyBad() {
  List<String> list = new ArrayList<>();
  // The spec permits this method to throw either IndexOutOfBoundsException or NullPointerException
  list.addAll(5, null);
}

void main() {
}
