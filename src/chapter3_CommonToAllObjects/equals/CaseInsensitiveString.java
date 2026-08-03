package chapter3_CommonToAllObjects.equals;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//Broken violates symmetry

public final class CaseInsensitiveString implements Comparable<CaseInsensitiveString> {
  private final String string;

  public CaseInsensitiveString(String string) {
    this.string = Objects.requireNonNull(string);
  }
  /*
    @Override
  public boolean equals(Object obj) {
    if (obj instanceof CaseInsensitiveString) {
      return string.equalsIgnoreCase(
              ((CaseInsensitiveString) obj).string);
    }
    if (obj instanceof String) { // one way interoperability
      return string.equalsIgnoreCase((String) obj);
    }
    return false;
  }
   */

  @Override
  public boolean equals(Object obj) {
    return obj instanceof CaseInsensitiveString &&
            ((CaseInsensitiveString) obj).string.equalsIgnoreCase(string);
  }

  static void main() {
    CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
    String s = "polish";
    System.out.println(cis.equals(s));
    System.out.println(s.equals(cis));
    List<CaseInsensitiveString> list = new ArrayList<>();
    list.add(cis);
    System.out.println(list.contains(s));
  }

  @Override
  public int compareTo(CaseInsensitiveString cis) {
    return String.CASE_INSENSITIVE_ORDER.compare(string, cis.string);
  }
}

