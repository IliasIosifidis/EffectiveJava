package chapter12_Serialization.enumForInstance;

import java.io.Serializable;

public class ElvisStealer implements Serializable {
  static Elvis impersonator;
  private Elvis payload;

  private Object readResolve(){
    // Save a reference to the "unresolved" Elvis instance
    impersonator = payload;

    // Return object of correct type for favouriteSongs field
    return new String[] {"a fool such as I"};
  }
  private static final long serialVersionUID = 0;
}
