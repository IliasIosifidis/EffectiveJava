package chapter7_LambdasAndStreams.preferCollectionToStream;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamIterable<E> {
  static void main() {
    // Won't compile, due to limitations on Java's type inference
//    for (ProcessHandle ph : ProcessHandle.allProcesses()::iterator){
//      System.out.println(ph);
//    }

    // Hideous workaround to iterate over a stream
    for (ProcessHandle ph : (Iterable<ProcessHandle>) ProcessHandle.allProcesses()::iterator) {
      System.out.println(ph.pid());
    }

    // Adapter from Stream<E> to Iterable<E>
//    public static <E> Iterable<E> iterableOf(Stream<E> stream){
//      return stream::iterator;
//    }
//    for (ProcessHandle ph: iterableOf(ProcessHandle.allProcesses())){}

    // Adapter from Iterable<E> to Stream<E>
//    public static <E> Stream<E>  streamOf(Iterable<E> iterable){
//      return StreamSupport.stream(iterable.spliterator(), false);
//    }

    // Returns the power set of an input set as custom collection
//    public static final <E> Collection<Set<E>> of(Set<E> s){
//      List<E> src = new ArrayList<>(s);
//      if (src.size() > 30)
//        throw new IllegalArgumentException("Set too big " + s);
//      return new AbstractList<Set<E>>() {
//        @Override public int size() {
//          return 1 << src.size(); // 2 to the power srcSize
//        }
//        @Override public boolean contains(Object o) {
//          return o instanceof Set && src.containsAll((Set)o);
//        }
//        @Override public Set<E> get(int index) {
//          Set<E> result = new HashSet<>();
//          for (int i = 0; index != 0; i++, index >>= 1)
//            if ((index & 1) == 1)
//              result.add(src.get(i));
//          return result;
//        }
//      };
//    }

    // Returns a stream of all the sublists of its input list
    class SubLists {
      public static <E> Stream<List<E>> of(List<E> list) {
        return Stream.concat(Stream.of(Collections.emptyList()),
                prefixes(list).flatMap(SubLists::suffixes));
      }

      private static <E> Stream<List<E>> prefixes(List<E> list) {
        return IntStream.rangeClosed(1, list.size())
                .mapToObj(end -> list.subList(0, end));
      }

      private static <E> Stream<List<E>> suffixes(List<E> list) {
        return IntStream.range(0, list.size())
                .mapToObj(start -> list.subList(start, list.size()));
      }
    }
  }
}
