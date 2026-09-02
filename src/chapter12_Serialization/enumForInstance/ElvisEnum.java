package chapter12_Serialization.enumForInstance;

import java.util.Arrays;

public enum ElvisEnum {
  INSTANCE;
  private String[] favouriteSongs =
          { "Hound Dog", "Heartbreak Hotel" };
  public void printFavorites() {
    System.out.println(Arrays.toString(favouriteSongs));
  }
}
