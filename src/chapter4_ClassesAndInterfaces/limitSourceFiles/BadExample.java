package chapter4_ClassesAndInterfaces.limitSourceFiles;

public class BadExample {
  static void main() {
    System.out.println(Utensil.NAME + Dessert.NAME);
  }

  // Two classes defined in one file. Don't ever do this!
  class Utensil{
    static final String NAME = "pan";
  }

  class Dessert{
    static final String NAME = "cake";
  }
}
