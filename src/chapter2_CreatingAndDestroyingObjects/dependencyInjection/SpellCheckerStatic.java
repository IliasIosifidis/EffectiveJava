package chapter2_CreatingAndDestroyingObjects.dependencyInjection;

// Inappropriate use of static utility - inflexible & unstable
public class SpellCheckerStatic {
//  private static final Lexicon dictionary = ...
  private SpellCheckerStatic(){} // Noninstantiable
//  public static boolean isValid(String word) {...}
//  public static List<String> suggestions(String typo) {...}
}
