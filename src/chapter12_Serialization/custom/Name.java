package chapter12_Serialization.custom;

import java.io.Serializable;

public class Name implements Serializable {
  /**
  * last name must be no-null
  * @serial
   */
  private final String lastName;
  /**
   * first name must be no-null
   * @serial
   */
  private final String firstName;
  /**
   * Middle name, or null if there is none.
   * @serial
   */
  private final String middleName;

  public Name(String lastName, String firstName, String middleName) {
    this.lastName = lastName;
    this.firstName = firstName;
    this.middleName = middleName;
  }
}
