package chapter12_Serialization.enumForInstance;

import java.io.Serializable;
import java.util.Arrays;

//Broken Singleton - has no transient object reference field!
public class Elvis implements Serializable {
  public static final Elvis INSTANCE = new Elvis();
  private Elvis(){}
  private String[] favouriteSongs = {"Hound Dog", "Heartbreak Hotel"};
  public void printFavourites(){
    System.out.println(Arrays.toString(favouriteSongs));
  }
  private Object readResolve(){
    return INSTANCE;
  }
}
