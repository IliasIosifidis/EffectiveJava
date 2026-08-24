package chapter9_GeneralProgramming.forEach;

import java.util.Iterator;

public interface IteratorExample<E> {
  // Returns an iteratior over the elements in this iterable
  Iterator<E> iterator();
}
