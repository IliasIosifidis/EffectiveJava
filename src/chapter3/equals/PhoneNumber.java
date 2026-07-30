package chapter3.equals;

// Class with a typical equals method
public final class PhoneNumber {
  private final short areaCode, prefix, lineNum;

  public PhoneNumber(short areaCode, short prefix, short lineNum) {
    this.areaCode = areaCode;
    this.prefix = prefix;
    this.lineNum = lineNum;
  }
  private static short rangeCheck(int val, int max, String arg) throws IllegalAccessException {
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
}
