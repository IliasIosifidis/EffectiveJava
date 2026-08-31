package chapter11_Concurrency.lazy;

public class LazyExample {
  /*
    // Normal initialization of instance field- synchronized accessor
  private FieldType field;

  private synchronized FieldType getField(){
    if (field == null){
      field = computeFieldValue();
    }
    return field;
  }


  //Lazy initialization holder class idiom for static fields
  private static class FieldHolder {
    static final FieldType field = computeFieldValue();
  }

  private static FieldType getField() { return FieldHolder.field; }


  // Double-check idiom for lazy initialization of instance fields
  private volatile FieldType field;
  private FieldType getField(){
    FieldType result = field;
    if (result == null) {
      synchronized(this){
        if (field == null) {
          field = result = computeFieldValue();
        }
     }
     return result;
  }

  // Single-check idiom - can cause repeated initialization!
  private volatile FieldType field;
  private FieldType getField(){
    FieldType result = field;
    if (result == null){
      field = result = computedFieldValue();
    }
    return result;
  }

  */


}
