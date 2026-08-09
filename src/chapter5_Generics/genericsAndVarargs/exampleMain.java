void main() {
  // Mixing generics and varargs can violate type safety!
  List<String> attributes = pickTwo("Good", "Fast", "Cheap");
}

static void dangerous(List<String>... stringLists) {
  List<Integer> integerList = List.of(42);
  Object[] objects = stringLists;
  objects[0] = integerList; // Heap pollution
  String s = stringLists[0].get(0); // ClassCastException


}
static <T> T[] toArray(T... args) {
  return args;
}

static <T> List<T> pickTwo(T a, T b, T c){
  switch (ThreadLocalRandom.current().nextInt(3)){
    case 0: return List.of(a,b);
    case 1: return List.of(a,c);
    case 2: return List.of(b,c);
}
  throw new AssertionError(); // unreachable statement
}

// Safe method with a generic varargs parameter
@SafeVarargs
static <T> List<T> flatten(List<? extends T> ...lists){
  List<T> result = new ArrayList<>();
  for (List<? extends T> list : lists){
    result.addAll(list);
  }
  return result;
}

// List as a typesafe alternative to a generic varargs parameter
static <T> List<T> flatten2(List<List<? extends T>> lists){
  List<T> result = new ArrayList<>();
  for (List<? extends T> list : lists){
    result.addAll(list);
  }
  return result;
}