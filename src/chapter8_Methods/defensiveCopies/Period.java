package chapter8_Methods.defensiveCopies;

import java.util.Date;

// Broken "immutable" time period class
public class Period {
  private final Date start;
  private final Date end;

  // Repaired constructor - makes defensive copies of parameters
  /**
   * @param start the beginning of the period
   * @param end the end of the period; must not precede start
   * @throws IllegalArgumentException if start is after end
   * @throws NullPointerException if start or end is null
   */
  public Period(Date start, Date end){
    this.start = new Date(start.getTime());
    this.end = new Date(end.getTime());
    if (start.compareTo(end) > 0 ){
      throw new IllegalArgumentException(start + "  after " + end);
    }
  }

  public Date start(){
    return start;
  }

  public Date end(){
    return end;
  }
}


