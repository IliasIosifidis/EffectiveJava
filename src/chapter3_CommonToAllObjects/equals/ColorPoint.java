package chapter3_CommonToAllObjects.equals;

import java.awt.*;
import java.util.Objects;

public class ColorPoint extends Point{
  private final Point point;
  private final Color color;
  public ColorPoint(int x, int y, Color color) {
    super(x,y);
    point = new Point(x,y);
    this.color = Objects.requireNonNull(color);
  }
  // Returns the point-view of this color point
  public Point asPoint(){
    return point;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof ColorPoint)){ return false;}
    ColorPoint colorPoint = (ColorPoint) obj;
    return colorPoint.point.equals(point) && colorPoint.color.equals(color);
  }

  /*
  // Broken, Violates symmetry
  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof ColorPoint)){
      return false;
    }
    return super.equals(obj) && ((ColorPoint) obj).color == color;
  }
 */

  // Broken - violates transitivity
  /*
    @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Point)) return false;
    // If obj is a normal Point, do a color-blind comparison
    if (!(obj instanceof ColorPoint)) return obj.equals(this);
    // obj is a ColorPoint; do a full comparison
//    return super.equals(obj) && ((Color) obj).color == color
    return false;
  }
   */





  static void main() {
    Point point = new Point(1,2);
    ColorPoint colorPoint = new ColorPoint(1,2,Color.BLUE);
    Point point1 = new Point(1,2);
    ColorPoint colorPoint1 = new ColorPoint(1,2,Color.BLACK);
    System.out.println(point.equals(colorPoint));
    System.out.println(colorPoint.equals(point));
    System.out.println(point.equals(point1));
    System.out.println(point1.equals(colorPoint1));
  }
}
