package chapter12_Serialization.proxies;

import java.io.Serializable;

public class EnumSerializationProxy <E extends Enum<E>> implements Serializable {
  /*
    // The element type of this enum set
  private final Class<E> elementType;

  // The elements contained in this enum set
  private final Enum<?>[] elements;

  EnumSerializationProxy(EnumSet<E> set) {
    elementType = set.elementType;
    elements = set.toArray(new Enum<?>[0]);
  }

  private Object readResolve(){
    EnumSet<E> result = EnumSet.noneOf(elementType);
    for (Enum<?> e : elements){
      result.add((E) e);
    }
    return result;
  }

  private static final long serialVersionUID = 973156872;
   */
}
