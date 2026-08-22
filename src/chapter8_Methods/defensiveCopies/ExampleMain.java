package chapter8_Methods.defensiveCopies;

import java.util.Date;

public class ExampleMain {
  // Attack the internals of a Period instance
  Date start = new Date();
  Date end = new Date();
  Period p = new Period(start, end);
  //  p.end.setTear(78) // Modifies internals of p!

  // Repaired accessors - make defensive copies of internal fields
  public Date start() {
    return new Date(start.getTime());
  }

  public Date end(){
    return new Date(end.getTime());
  }
}
