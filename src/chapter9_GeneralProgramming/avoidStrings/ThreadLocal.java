package chapter9_GeneralProgramming.avoidStrings;

public final class ThreadLocal {
  private ThreadLocal(){}

  // Sets the current thread's value for the named variable.
  public static void set(String key, Object value){};

  // Returns the current thread's value for the named variable.
  public static Object get(String key){return "key";}


}
