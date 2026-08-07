package chapter5_Generics.listsToArrays;

public class Main {
  static void main() {
    // fails at runtime
    Object[] objects = new Long[1];
    objects[0] = "doesnt fit";

    /* wont compile
    List<Object> objectList = new ArrayList<Long>();
    objectList.add("wont fit");
     */
  }
}
