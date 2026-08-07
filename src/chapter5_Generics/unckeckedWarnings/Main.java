package chapter5_Generics.unckeckedWarnings;

import java.util.Arrays;

// Adding local variable to reduce scope of @SupressWarunings
public class Main {
  public <T> T[] toArray(T[] a){
    int size  = 10;
    Object[] elements = new Object[0];
    if (a.length < size){
      // This cast is correct because the array we're creating
      // is of the same type as the one passed in, which is T[].
      @SuppressWarnings("unchecked") T[] result =
      (T[]) Arrays.copyOf(elements, size, a.getClass());
    }
    System.arraycopy(elements, 0, a, 0, size);
    if (a.length > size){
      a[size] = null;
    }
    return a;
  }
}
