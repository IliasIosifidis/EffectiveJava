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
}























