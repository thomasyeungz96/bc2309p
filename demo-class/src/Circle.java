import java.math.BigDecimal;

public class Circle {

  double radius;
  String color;

  // constructor
  public Circle() {

  }
//allargconstructor
  public Circle(double radius, String color) {
    this.radius = radius;
    this.color = color;
  }

  //setter
  public void setColor(String color) {
    this.color = color;
  }


  public void setRadius(double radius) {
    this.radius = radius;
  }

  //getter

  public double area() {
    // BigDecimal
    BigDecimal radius = BigDecimal.valueOf(this.radius);
    BigDecimal pi = BigDecimal.valueOf(Math.PI);
    return radius.multiply(radius).multiply(pi).doubleValue();
  }

  public static void main(String[] args) {

    Circle circle1 = new Circle(1.0, "RED");
    System.out.println(circle1.area());

    Circle circle2 = new Circle();
    circle2.setRadius(1.0);
    circle2.setColor("YELLOW");
    System.out.println(circle2.area());
    circle2.setRadius(3.0);
    System.out.println(circle2.area());
    
  }



}
