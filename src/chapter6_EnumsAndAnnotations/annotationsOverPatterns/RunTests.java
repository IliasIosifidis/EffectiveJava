import chapter6_EnumsAndAnnotations.annotationsOverPatterns.ExceptionTest;
import chapter6_EnumsAndAnnotations.annotationsOverPatterns.Sample;
import chapter6_EnumsAndAnnotations.annotationsOverPatterns.Test;

void main(String[] args) throws ClassNotFoundException {
  int tests = 0;
  int passed = 0;
  Class<?> testClass = Class.forName(Sample.class.getName());
  for (Method m : testClass.getDeclaredMethods()) {
    if (m.isAnnotationPresent(Test.class)) {
      tests++;
      try {
        m.invoke(null);
        System.out.printf("Test %s failed: no exception%n", m);
      } catch (Throwable wrappedExc) {
        Throwable exc = wrappedExc.getCause();
        int oldPassed = passed;
        Class<? extends Exception>[] excTypes =
                m.getAnnotation(ExceptionTest.class).value();
        for (Class<? extends Exception> excType : excTypes) {
          if (excType.isInstance(exc)) {
            passed++;
            break;
          }
        }
        if (passed == oldPassed)
          System.out.printf("Test %s failed: %s %n", m, exc);
      }
    }
  }
  System.out.printf("Passed: %d, Failed: %d%n",
          passed, tests - passed);
}