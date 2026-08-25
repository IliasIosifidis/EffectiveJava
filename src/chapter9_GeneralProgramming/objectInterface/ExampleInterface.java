package chapter9_GeneralProgramming.objectInterface;

import java.util.LinkedHashSet;
import java.util.Set;

public class ExampleInterface {
  // Good - uses interface as type
  Set<String> stringSet = new LinkedHashSet<>();

  // Bad - uses class as type!
  LinkedHashSet<String> stringLinkedHashSet = new LinkedHashSet<>();
}
