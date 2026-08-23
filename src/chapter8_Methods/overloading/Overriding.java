package chapter8_Methods.overloading;

import java.util.Collection;
import java.util.List;
import java.util.Set;

class Wine {
  String name() {
    return "wine";
  }
}

class SparklingWine extends Wine {
  @Override
  String name() {
    return "sparkling wine";
  }
}

class Champagne extends SparklingWine {
  @Override
  String name() {
    return "Champagne";
  }
}

public class Overriding {
  static void main() {
    List<Wine> wineList = List.of(
            new Wine(), new SparklingWine(), new Champagne()
    );
    for (Wine wine : wineList) {
      System.out.println(wine.name());
    }
  }
  public static String classify(Collection<?> c){
    return c instanceof Set<?> ? "Set" :
            c instanceof List<?> ? "List": "Unknown Collection";
  }
}

