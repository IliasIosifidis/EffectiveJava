import chapter4_ClassesAndInterfaces.compositionOverInheritance.InstrumentedHashSet;

void main() {
  InstrumentedHashSet<String> strings = new InstrumentedHashSet<>();
  strings.addAll(List.of("this", "and" , "that"));
  strings.forEach(System.out::println);
  System.out.println(strings.getAddCount());
}