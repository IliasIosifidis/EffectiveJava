package chapter3.equals;

// Class with a typical equals method
public final class PhoneNumber {
  private final int areaCode, prefix, lineNum;

  public PhoneNumber(int areaCode, int prefix, int lineNum) {
    this.areaCode = areaCode;
    this.prefix = prefix;
    this.lineNum = lineNum;
  }
  private static int rangeCheck(int val, int max, String arg) throws IllegalAccessException {
    if (val < 0 || val > max) throw new IllegalAccessException(arg + ": " + val);
    return (short) val;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) return true;
    if (!(obj instanceof PhoneNumber)) return false;
    PhoneNumber phoneNumber = (PhoneNumber) obj;
    return phoneNumber.lineNum == lineNum && phoneNumber.prefix == prefix
            && phoneNumber.areaCode == areaCode;
  }
  /*
    // Typical hashCode method
  @Override
  public int hashCode(){
    int result = Integer.hashCode(areaCode);
    result = 31 * result + Integer.hashCode(prefix);
    result = 31 * result + Integer.hashCode(lineNum);
    return result;
  }

    // One-line hashCode method - mediocre performance
  @Override public int hashCode() {
    return Objects.hash(lineNum, prefix, areaCode);
  }
   */

  // hasCode method with lazily initialized cached has code
  private int hasCode; // Automatically initialized to 0

  @Override
  public int hashCode() {
    int result = hasCode;
    if (result == 0){
      result = Integer.hashCode(areaCode);
      result = 31 * result + Integer.hashCode(prefix);
      result = 31 * result + Integer.hashCode(lineNum);
      hasCode = result;
    }
    return result;
  }

  /**
   * Returns the string representation of this phone number.
   * The string consists of twelve characters whose format is
   * "XXX-YYY-ZZZZ", where XXX is the area code, YYY is the
   * prefix, and ZZZZ is the line number. Each of the capital
   * letters represents a single decimal digit.
   * If any of the three parts of this phone number is too small
   * to fill up its field, the field is padded with leading zeros.
   * For example, if the value of the line number is 123, the last
   * four characters of the string representation will be "0123".
   */

  @Override
  public String toString() {
    return String.format("%03d-%03d-%04d", areaCode, prefix, lineNum);
  }

  //Clone method for class with no references to mutable state
  @Override
  protected Object clone() throws CloneNotSupportedException {
    try {
      return (PhoneNumber) super.clone();
    } catch (CloneNotSupportedException e ){
      throw new AssertionError(); // Can't happen
    }
  }
}























