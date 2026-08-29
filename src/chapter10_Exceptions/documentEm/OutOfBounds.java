package chapter10_Exceptions.documentEm;

public class OutOfBounds extends IndexOutOfBoundsException {
  private final int lowerBound;
  private final int upperBound;
  private final int index;

  /**
   * Constructs an OutOfBounds exception.
   *
   * @param lowerBound the lowest legal index value
   * @param upperBound the highest legal index value plus one
   * @param index      the actual index value
   */
  public OutOfBounds(int lowerBound, int upperBound, int index) {
    // Generate a detail message that captures the failure
    super(String.format(
            "Lower bound: %d, Upper bound: %d, Index: %d", lowerBound, upperBound, index
    ));
    // Save failure information for programmatic access
    this.lowerBound = lowerBound;
    this.upperBound = upperBound;
    this.index = index;
  }
}
