package chapter10_Exceptions.eceptionalConditions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Horrible abuse of exceptions
public class BadExample2 {
  static Collection collection = new ArrayList<>();

  static void main() {
    // Do not use this hideous code for iteration over a collection!
    try {
      Iterator<Foo> i = collection.iterator();
      while (true){
        Foo foo = i.next();
      }
    } catch (NoSuchElementException e) {
      throw new RuntimeException(e);
    }
  }
}

record Foo(String foosName) {}
