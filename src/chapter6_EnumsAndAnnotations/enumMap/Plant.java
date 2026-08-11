package chapter6_EnumsAndAnnotations.enumMap;

public class Plant {
  public enum LifeCycle { ANNUAL, PERENNIAL, BIENNIAL}
  final String name;
  public final LifeCycle lifeCycle;

  Plant(String name, LifeCycle lifeCycle){
    this.name = name; this.lifeCycle = lifeCycle;
  }

  @Override
  public String toString(){
    return name;
  }
}