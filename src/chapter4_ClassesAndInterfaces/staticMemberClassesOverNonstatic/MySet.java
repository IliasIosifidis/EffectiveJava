package chapter4_ClassesAndInterfaces.staticMemberClassesOverNonstatic;

import java.util.AbstractSet;
import java.util.Iterator;

public class MySet<E> extends AbstractSet<E> {
  @Override
  public Iterator<E> iterator() {return new MyIterator();}
  
  private class MyIterator implements Iterator<E>{
    @Override public boolean hasNext() {return false;}
    @Override public E next() {return null;}
  }

  @Override public int size() {return 0;}
}
