import java.math.BigDecimal;

public class Triangle {
  // Once it is created, it's base & height cannot revised
  double base;

  double height;

  // public Triangle() {
  // }

  public Triangle(double base, double height) {
    this.base = base;
    this.height = height;
  }

  public double area() {
    return BigDecimal.valueOf(this.base)
        .multiply(BigDecimal.valueOf(this.height)) //
        .divide(BigDecimal.valueOf(2)) //
        .doubleValue();
  }

  public static void main(String[] args) {
    Triangle triangle = new Triangle(3.0, 4.0); // new object in heap
    System.out.println(triangle.area()); // 6.0
    
    // Triangle triangle2 = new Triangle();
  }
}
