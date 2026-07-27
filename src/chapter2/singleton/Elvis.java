package chapter2.singleton;

// Singleton with public final field
public class Elvis {
  public static final Elvis INSTANCE = new Elvis();
  private Elvis(){}
  public void leaveTheBuilding(){ System.out.println("No!\nI'm staying"); }

  // readResolve method to prevent singleton property
  private Object readResolve(){
    // Return the one true Elvis and let the garbage collector take care of the Elvis impersonator
    return INSTANCE;
  }
}
