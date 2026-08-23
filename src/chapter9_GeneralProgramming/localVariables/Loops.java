package chapter9_GeneralProgramming.localVariables;

import javax.swing.text.Element;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Loops {
  static void main() {
    List<Element> elementList = new ArrayList<>();
    List<Element> elementList2 = new ArrayList<>();

    // Preferred idiom for iterating over a collection or array
    for (Element element : elementList){
      element.getAttributes();
    }

    // Idiom for iterating when you need the iterator
    for (Iterator<Element> i = elementList.iterator(); i.hasNext();){
      Element element = i.next();
    }

    Iterator<Element> i = elementList.iterator();
    while (i.hasNext()){
      System.out.println(i.hasNext());
    }
    Iterator<Element> i2 = elementList.iterator();
    while (i.hasNext()){  // BUG!
      System.out.println(i2.hasNext());
    }

    for (Iterator<Element> j = elementList.iterator(); j.hasNext();){
      Element e = j.next();
    }

    // Compile-time error - cannot find symbol j
//    for (Iterator<Element> j2 = elementList2.iterator(); j.hasNext();){
//      Element e2 = j2.next();
//    }
  }
}
