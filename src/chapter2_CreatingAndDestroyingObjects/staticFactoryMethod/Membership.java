package chapter2_CreatingAndDestroyingObjects.staticFactoryMethod;

import lombok.AllArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
public class Membership {
  private final String type;
  private final BigDecimal monthlyFee;
  private final int freezeAllowanceDays;

  public static Membership standard(){
    return new Membership("STANDARD", new BigDecimal("29.99"), 14);
  }

  public static Membership corporate(){
    return new Membership("CORPORATE", new BigDecimal("19.99"), 30);
  }

  public static Membership trial(){
    return new Membership("TRIAL", BigDecimal.ZERO, 0);
  }
}

