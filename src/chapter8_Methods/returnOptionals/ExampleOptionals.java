package chapter8_Methods.returnOptionals;

import java.util.Collection;
import java.util.Objects;

public class ExampleOptionals {
  public static <E extends Comparable<E>> E max(Collection<E> c) {
    if (c.isEmpty()) {
      throw new IllegalArgumentException("Empty collection");
    }
    E result = null;
    for (E e : c) {
      if (result == null || e.compareTo(result) > 0) {
        result = Objects.requireNonNull(e);
      }
    }
    return result;
  }

  // Returns max val in collection as Optional<E> - uses stream
//  public static <E extends Comparable<E>>{
//    Optional <E> max(Collection<E> c){
//      return c.stream().max(Comparator.naturalOrder());
//    }
//  }

  // Using an optional to provide a chosen default value
//  String lastWordInLexicon = max(words).orElse("No words...");

  // Using an optional to throw a chosen exception
//  Toy myToy = max(toys).orElseThrow(TemperTantrumException::new);

  // Using optional when you know there’s a return value
//  Element lastNobleGas = max(Elements.NOBLE_GASES).get();
}
