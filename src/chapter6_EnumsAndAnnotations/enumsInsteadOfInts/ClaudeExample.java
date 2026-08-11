package chapter6_EnumsAndAnnotations.enumsInsteadOfInts;

import java.util.EnumSet;

public class ClaudeExample {
  EnumSet<Apple> apples = EnumSet.of(Apple.FUJI, Apple.PIPPIN);
  EnumSet<Orange> oranges = EnumSet.of(Orange.NAVEL);
//  apples.add(Orange.NAVEL);          // COMPILE ERROR — Orange isn't an Apple
//  EnumSet<Apple> mixed = oranges;     // COMPILE ERROR — incompatible types entirely
}
