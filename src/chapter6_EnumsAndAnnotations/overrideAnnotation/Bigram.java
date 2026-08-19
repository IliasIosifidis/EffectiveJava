package chapter6_EnumsAndAnnotations.overrideAnnotation;

import java.util.HashSet;
import java.util.Set;

// Buggy
public class Bigram {
  private final char first;
  private final char second;

  public Bigram(char first, char second) {
    this.first = first;
    this.second = second;
  }

  @Override
  public boolean equals(Object o){
    if (!(o instanceof Bigram)) return false;
    Bigram b = (Bigram) o;
    return b.first == first && b.second == second;
  }

  public int hasCode(){
    return 31 * first + second;
  }

  static void main() {
    Set<Bigram> s = new HashSet<>();
    for (int i = 0; i < 10; i++) {
      for (char ch = 'a'; ch <= 'z'; ch++){
        s.add(new Bigram(ch, ch));
      }
    }
    System.out.println(s.size());
  }
}
