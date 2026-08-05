package chapter4_ClassesAndInterfaces.preferHierarchies;

// Tagged class - vastly inferior to a class hierarchy
public class FigureWrong {
  enum Shape {RECTANGLE, CIRCLE};
  // Tag field - the shape of this figure
  final Shape shape;

  // These fields are used only if shape is RECTANGLE
  double length;
  double width;

  // This field is used only if shape is CIRCLE
  double radius;

  // Constructor for circle
  FigureWrong(double radius){
    shape = Shape.CIRCLE;
    this.radius = radius;
  }

  // Constructor for RECTANGLE
  FigureWrong(double length, double width){
    shape = Shape.RECTANGLE;
    this.width = width;
    this.length = length;
  }

  double area(){
    return switch (shape) {
      case RECTANGLE -> length * width;
      case CIRCLE -> Math.PI * (radius * radius);
      default -> throw new AssertionError(shape);
    };
  }
}
