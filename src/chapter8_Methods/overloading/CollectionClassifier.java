package chapter8_Methods.overloading;

import java.util.*;

// Broken! What does this program print?
public class CollectionClassifier {
  public static String classify(Set<?> set){
    return "Set";
  }
  public static String classify(List<?> list){
    return "List";
  }
  public static String classify(Collection<?> collection){
    return "Unknown Collection";
  }

  static void main() {
    Collection<?>[] collections ={
            new HashSet<>(),
            new ArrayList<>(),
            new HashMap<String ,String>().values(),
    };

    for (Collection<?> collection : collections){
      System.out.println(classify(collection));
    }
  }

}
