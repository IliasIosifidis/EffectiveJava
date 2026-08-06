package chapter4_ClassesAndInterfaces.limitSourceFiles;

public class GoodExample {
  static void main() {
    System.out.println(Utensil.NAME + Dessert.NAME);
  }

  // Static member classes instead of multiple top-level classes
  private static class Utensil{
    static final String NAME = "pan";
  }

  private static class Dessert{
    static final String NAME = "cake";
  }
}
