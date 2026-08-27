package chapter10_Exceptions.UnnecessaryChecked;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExampleUnchecked {
  static void main() {
    File file = new File("My_file");
    try {
      Scanner scanner = new Scanner(file);
      System.out.println(scanner);
    } catch (FileNotFoundException e) {
      throw new RuntimeException("text" , e);
    }

    /*
         Invocation with checked exception
    try {
      obj.action(args);
    } catch (TheCheckedException e) {
... // Handle exceptional condition
    }
     */


    /*
    // Invocation with state-testing method and unchecked exception
  if (obj.actionPermitted(args)) {
    obj.action(args);
  } else {
  ... // Handle exceptional condition
  }
     */
  }
}
