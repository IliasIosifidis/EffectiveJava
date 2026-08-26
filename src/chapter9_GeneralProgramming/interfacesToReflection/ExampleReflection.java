package chapter9_GeneralProgramming.interfacesToReflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Set;

// Reflective instantiation with interface access
public class ExampleReflection {
  // Translate the class name into a Class object
  static void main(String[] args) {
    Class<? extends Set<String>> cl = null;
    try {
      cl = (Class<? extends Set<String>>) // Unchecked cast!
              Class.forName(args[0]);
    } catch (ClassNotFoundException e) {
      fatalError("No parameterless constructor");
    }
    // Get the constructor
    Constructor<? extends  Set<String>> cons = null;
    try {
      cons = cl.getDeclaredConstructor();
    }catch (NoSuchMethodException e){
      throw new RuntimeException("No parameterless constructor");
    }
    // Instantiate the set
    Set<String> s = null;
    try {
      s = cons.newInstance();
    } catch (IllegalAccessException e) {
      fatalError("Constructor not accessible");
    } catch (InstantiationException e) {
      fatalError("Class not instantiable.");
    } catch (InvocationTargetException e) {
      fatalError("Constructor threw " + e.getCause());
    } catch (ClassCastException e) {
      fatalError("Class doesn't implement Set");
    }
    // Exercise the set
    s.addAll(Arrays.asList(args).subList(1, args.length));
    System.out.println(s);
  }
  private static void fatalError(String msg){
    System.err.println(msg);
    System.exit(1);
  }
}
