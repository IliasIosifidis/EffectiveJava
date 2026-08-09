static void main() {
  class Stack<E> {
    public Stack(){};
    public void push(E e){};
    public E pop(){return null;};
    public boolean isEmpty(){return true;}

    //pushAll method without wildcard type - deficient!
    public void pushAll(Iterable<? extends E> src){
      for (E e : src){
        push(e);
      }
    }
    // popAll method without wildcard type - deficient
    public void popAll(Collection<? super E> dst){
      while (!isEmpty()){
        dst.add(pop());
      }
    }
  }
  Stack<Number> numberStack = new Stack<>();

  Iterable<Integer> integers = List.of(1,2,4);
  numberStack.pushAll(integers);

  Collection<Object> objects = List.of("es", 3,true);
  numberStack.popAll(objects);
}