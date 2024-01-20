import java.math.BigDecimal;

public class Circle {
  // area
  // radius * radius * pi (3.14)
  // Math.PI

  double radius;

  String color; // enum

  public Circle() {

  }

  public Circle(double radius, String color) { //
    this.radius = radius;
    this.color = color; // 
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double area() {
    // BigDecimal
    BigDecimal radius = BigDecimal.valueOf(this.radius);
    BigDecimal pi = BigDecimal.valueOf(Math.PI);
    return radius.multiply(radius).multiply(pi).doubleValue();
  }

  public static void main(String[] args) {
    // new Circle
    Circle circle = new Circle(1.0, "RED");
    System.out.println(circle.area()); // 3.141592653589793

    Circle circle2 = new Circle();
    circle2.setRadius(1.0);
    circle2.setColor("YELLOW");
    System.out.println(circle2.area()); // 3.141592653589793
    circle2.setRadius(3.3);
    System.out.println(circle2.area()); // 34.21194399759285
  }

}
