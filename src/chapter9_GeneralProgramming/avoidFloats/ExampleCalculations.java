package chapter9_GeneralProgramming.avoidFloats;

import java.math.BigDecimal;

public class ExampleCalculations {
  static void main() {
    System.out.println(1.03 - 0.42);
    System.out.println(1.00f - 9 * 0.10f);

    // Broken - uses floating point for monetary calculation!
    double funds = 1.00;
    int itemsBought = 0;
    for (double price = 0.10; funds >= price; price += 0.10) {
      funds -= price;
      itemsBought++;
    }
    System.out.println("items bought: " + itemsBought);
    System.out.println("Change: $" + funds);

    final BigDecimal TEN_CENTS = new BigDecimal("0.10");
    int itemsBought2 = 0;
    BigDecimal funds2 = new BigDecimal("1.00");
    for (BigDecimal price2 = TEN_CENTS; funds2.compareTo(price2) >=0; price2 = price2.add(TEN_CENTS)){
      funds2 = funds2.subtract(price2);
      itemsBought2++;
    }
    System.out.println("items bought2: " + itemsBought2);
    System.out.println("Change2: $" + funds2);
  }
}
