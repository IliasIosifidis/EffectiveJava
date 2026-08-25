package chapter9_GeneralProgramming.avoidStrings;

public final class ThreadLocal2 {
  private ThreadLocal2(){} // noninstantiable

  public static class Key{ // (Capability)
    Key(){}
  }

  // Generates a unique unforgeable key
  public static Key getKey(String key, Object value){
    return new Key();
  };

  public static void set(Key key, Object value){};
  public static Object get(Key key) {
    return key;
  }


}
