import chapter6_EnumsAndAnnotations.enumMap.Plant;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toSet;

// Using ordinal() to index into an array - DON'T DO THIS!
void main() {
  Set<Plant>[] plantsByLifeCycle =
          (Set<Plant>[]) new Set[Plant.LifeCycle.values().length];
  for (int i = 0; i < plantsByLifeCycle.length; i++)
    plantsByLifeCycle[i] = new HashSet<>();
  Plant[] garden = new Plant[0];
  for (Plant p : garden)
    plantsByLifeCycle[p.lifeCycle.ordinal()].add(p);
// Print the results
  for (int i = 0; i < plantsByLifeCycle.length; i++) {
    System.out.printf("%s: %s%n",
            Plant.LifeCycle.values()[i], plantsByLifeCycle[i]);
  }

  // Using an EnumMap to associate data with an enum
  Map<Plant.LifeCycle, Set<Plant>> plantsByLifeCycle2 =
          new EnumMap<>(Plant.LifeCycle.class);
  for (Plant.LifeCycle lc : Plant.LifeCycle.values())
    plantsByLifeCycle2.put(lc, new HashSet<>());
  for (Plant p : garden)
    plantsByLifeCycle2.get(p.lifeCycle).add(p);
  System.out.println(plantsByLifeCycle2);

  // Naive stream-based approach - unlikely to produce an EnumMap!
  System.out.println(Arrays.stream(garden)
          .collect(groupingBy(p -> p.lifeCycle)));

  // Using a stream and an EnumMap to associate data with an enum
  System.out.println(Arrays.stream(garden)
          .collect(groupingBy(p -> p.lifeCycle,
                  () -> new EnumMap<>(Plant.LifeCycle.class), toSet())));
}
