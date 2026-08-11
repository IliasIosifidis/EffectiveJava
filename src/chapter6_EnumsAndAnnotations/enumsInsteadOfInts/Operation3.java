import static chapter4_ClassesAndInterfaces.minimizeAccessibility.MinimizeAccessibility.values;
import static java.util.stream.Collectors.toMap;

// Enum type with constant-specific class bodies and data
public enum Operation3 {
  PLUS("+") {
    public double apply(double x, double y) { return x + y; }
  },
  MINUS("-") {
    public double apply(double x, double y) { return x - y; }
  },
  TIMES("*") {
    public double apply(double x, double y) { return x * y; }
  },
  DIVIDE("/") {
    public double apply(double x, double y) { return x / y; }
  };

  private final String symbol;

  Operation3(String symbol) {
    this.symbol = symbol;
  }

  @Override
  public String toString() {
    return symbol;
  }

  public abstract double apply(double x, double y);
}
// Implementing a fromString method on an enum type
private static final Map<String, Operation3> stringToEnum =
        Stream.of(values()).collect(
                toMap(Object::toString, e -> (Operation3) e));

// Returns Operation for string, if any
public static Optional<Operation3> fromString(String symbol) {
  return Optional.ofNullable(stringToEnum.get(symbol));
}

void main(String[] args) {
  double x = Double.parseDouble(args[0]);
  double y = Double.parseDouble(args[1]);
  for (Operation3 op : Operation3.values()){
    System.out.printf("%f %s %f = %f%n",
            x, op, y, op.apply(x, y));
  }
}

