package chapter7_LambdasAndStreams.streamsJudictiously;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Anagrams {
  static void main(String[] args) throws FileNotFoundException {
    File dictionary = new File(args[0]);
    int minGroupSize = Integer.parseInt(args[1]);

    Map<String , Set<String >> groups = new HashMap<>();
    try (Scanner scanner = new Scanner(dictionary)){
      while (scanner.hasNext()){
        String word = scanner.next();
        groups.computeIfAbsent(alphabetize(word),
                (unused) -> new TreeSet<>()).add(word);
      }
    }

    for (Set<String> group : groups.values())
      if (group.size() >= minGroupSize) System.out.println(group.size()+ ": " + group);
  }
  private static String alphabetize(String s){
    char[] a = s.toCharArray();
    Arrays.sort(a);
    return new String(a);
  }
}
