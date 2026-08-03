package chapter3_CommonToAllObjects.equals;

import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class Point {
  private final int x;
  private final int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

//  @Override
//  public boolean equals(Object obj) {
//    if (!(obj instanceof Point)) {
//      return false;
//    }
//    Point point = (Point) obj;
//    return point.x == x && point.y == y;
//  }

  // Broken - violates Liskov substitution principle
  @Override
  public boolean equals(Object obj) {
    if (obj == null || obj.getClass() != getClass())
      return false;
    Point p = (Point) obj;
    return p.x == x && p.y == y;
  }

  private static final Set<Point> unitCircle = Set.of(
          new Point(1, 0),
          new Point(0, 1),
          new Point(-1, 0),
          new Point(0, -1));
  public static boolean onUnitCircle(Point p){
    return unitCircle.contains(p);
  }

  public class CounterPoint extends Point{
    public static final AtomicInteger counter =
            new AtomicInteger();

    public CounterPoint(int x, int y) {
      super(x, y);
      counter.incrementAndGet();
    }
    public static int numberCreated(){
      return counter.get();
    }
  }
}







































