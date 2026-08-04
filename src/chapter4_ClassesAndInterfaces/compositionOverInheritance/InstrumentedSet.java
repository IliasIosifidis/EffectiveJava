package chapter4_ClassesAndInterfaces.compositionOverInheritance;

import java.util.Collection;
import java.util.Set;

// Wrapper class - uses composition in place of inheritance
public class InstrumentedSet<E> extends ForwardingSet<E> {
  private int addCount = 0;
  static void walk(Set<Dog> dogs){
    InstrumentedSet<Dog> iDogs = new InstrumentedSet<>(dogs);
  }

  public static class Dog {
    private String name;
    private String race;
    public Dog() {}
  }

  public InstrumentedSet(Set<E> s){
    super(s);
  }

  @Override
  public boolean add(E e){
    addCount++;
    return super.add(e);
  }

  @Override
  public boolean addAll(Collection<? extends E> c){
    addCount += c.size();
    return super.addAll(c);
  }

  public int getAddCount(){
    return addCount;
  }
}
