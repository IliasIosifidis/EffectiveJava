package chapter2_CreatingAndDestroyingObjects.noninstantiability;

// Non-instantiable utility class
public class UtilityClass {
  // suppress default constructor for noninstantiability
  private UtilityClass(){
    throw new AssertionError();
  }
  // The rest of the class
}
