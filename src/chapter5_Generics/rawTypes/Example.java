// Fails at runtime-unsafe method users raw type List
void main() {
  List<String> strings = new ArrayList<>();
  unsafeAdd(strings, Integer.valueOf(24));
  String s = strings.get(0); // compiler-generated cast
}
private static void unsafeAdd(List list, Object o){
  list.add(o);
}

// Use of raw type for unknown element type - don't do this!
static int numElementsInCommon(Set s1, Set s2) {
  int result = 0;
  for (Object o1 : s1)
    if (s2.contains(o1))
      result++;
  return result;
}


// Uses unbounded wildcard type - typesafe and flexible
//static int numElementsInCommon(Set<?> s1, Set<?> s2) { return 0;}
/*
 Legitimate use of raw type - instanceof operator
if (o instanceof Set) { // Raw type
Set<?> s = (Set<?>) o; // Wildcard type
...
        }
 */
