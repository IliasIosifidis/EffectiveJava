package chapter2.builder;

public class Calzone extends PizzaBuilder{
  private final boolean sauceInside;

  public static class Builder extends PizzaBuilder.Builder<Builder>{
    private boolean sauceInside = false; // Default

    public Builder sauceInside() {
      sauceInside = true;
      return this;
    }

    @Override
    public Calzone build(){
      return new Calzone(this);
    }
    @Override protected  Builder self() { return this;}
  }
  private Calzone(Builder builder){
    super(builder);
    sauceInside = builder.sauceInside;
  }
}
