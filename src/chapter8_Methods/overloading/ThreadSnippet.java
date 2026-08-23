package chapter8_Methods.overloading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadSnippet {
  static void main() {
    new Thread(System.out::println).start();
    ExecutorService exec = Executors.newCachedThreadPool();
//    exec.submit(System.out::println);
  }
}
