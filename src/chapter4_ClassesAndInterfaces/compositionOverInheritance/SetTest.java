import chapter4_ClassesAndInterfaces.compositionOverInheritance.InstrumentedSet;

void main() {
  int INIT_CAPACITY = 16;
  Set<Instant> times = new InstrumentedSet<>(new TreeSet<>());
  Set<String> s = new InstrumentedSet<>(new HashSet<>(INIT_CAPACITY));

}