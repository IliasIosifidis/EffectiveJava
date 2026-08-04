package chapter4_ClassesAndInterfaces.designForInheritance;

public class Super {
  // Broken - constructor invokes an overridable method
  public Super() {
    overrideMe();
  }

  public void overrideMe() {
  }
}
