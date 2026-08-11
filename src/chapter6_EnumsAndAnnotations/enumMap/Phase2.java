package chapter6_EnumsAndAnnotations.enumMap;

public enum Phase2 {
  SOLID, LIQUID, GAS;
  public enum Transition {
    MELT, FREEZE, BOIL, CONDENSE, SUBLIME, DEPOSIT;
    // Rows indexed by from-ordinal, cols by to-ordinal
    private static final Transition[][] TRANSITIONS = {
            { null, MELT, SUBLIME },
            { FREEZE, null, BOIL },
            { DEPOSIT, CONDENSE, null }
    };
    // Returns the phase transition from one phase to another
    public static Transition from(Phase2 from, Phase2 to) {
      return TRANSITIONS[from.ordinal()][to.ordinal()];
    }
  }
}
