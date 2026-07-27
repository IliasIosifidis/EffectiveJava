package chapter2.builder;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class PizzaBuilder {
  public enum Topping {HAM, MUSHROOM,ONION,PEPPER,SAUSAGE}
  final Set<Topping> toppings;
  abstract static class Builder<T extends Builder<T>>{
    EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
    public T addTopping(Topping topping){
      toppings.add(Objects.requireNonNull(topping));
      return self();
    }
    abstract PizzaBuilder build();
    // subclasses must override this method to return "this" protected abstract T self();
    protected abstract T self();
  }
  PizzaBuilder(Builder<?> builder){
    toppings = builder.toppings.clone();
  }
}
