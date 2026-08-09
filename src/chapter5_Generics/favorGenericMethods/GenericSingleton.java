package chapter5_Generics.favorGenericMethods;

import java.util.Collection;
import java.util.Objects;
import java.util.function.UnaryOperator;

public class GenericSingleton {
  static void main() {
    String[] strings = {"jute", "hemp", "nylon"};
    UnaryOperator<String> sameString = identityFunction();
    for (String s : strings){
      System.out.println(sameString.apply(s));
    }

    Number[] numbers = {1,2,3.0,4L};
    UnaryOperator<Number> sameNumber = identityFunction();
    for (Number n: numbers){
      System.out.println(n);
    }
  }
  // Generic singleton factory pattern
  private static UnaryOperator<Object> IDENTITY_FN = (t) -> t;

  @SuppressWarnings("unchecked")
  public static <T> UnaryOperator<T> identityFunction(){
    return (UnaryOperator<T>) IDENTITY_FN;
  }
  // Recursive type bound
  public interface Comparable<T>{
    int compareTo(T o);
  }

  //Returns max value in a collection - uses recursive type bound
  public static <E extends Comparable<E>> E max(Collection<E> c) {
    if (c.isEmpty()) throw new IllegalArgumentException("Empty collection");
    E result = null;
    for (E e : c){
      if (result == null || e.compareTo(result) > 0){
        result = Objects.requireNonNull(e);
      }
      return result;
    }
    return null;
  }
}
