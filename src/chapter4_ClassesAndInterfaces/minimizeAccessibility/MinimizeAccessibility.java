package chapter4_ClassesAndInterfaces.minimizeAccessibility;

import java.util.List;

public class MinimizeAccessibility {
  // Potential security hole
  public static final Object[] VALUES = {};

  // Safe
  private static final Object[] PRIVATE_VALUES = {};
  public static final List<Object> VALUES2 = List.of(PRIVATE_VALUES);

  // Safe
  private final Object[] PRIVATE_VALUES2 = {};
  public static final Object[] values(){
    return PRIVATE_VALUES.clone();
  }
}
