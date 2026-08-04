package chapter4_ClassesAndInterfaces.designForInheritance;

import java.time.Instant;

public class Sub extends Super{
  // Blank final, set by constructor
  private final Instant instant;

  Sub(){
    instant = Instant.now();
  }

  // Overriding method invoked by superclass constructor
  @Override
  public void overrideMe(){
    System.out.println(instant);
  }

  static void main() {
    Sub sub = new Sub();
    sub.overrideMe();
  }
}
