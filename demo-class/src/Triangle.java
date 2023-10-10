import java.math.BigDecimal;

public class Triangle {

  double height;
  double base;

  public Triangle() {

  }


  public Triangle(double base, double height) {
    this.base = base;
    this.height = height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double area() {
    return BigDecimal.valueOf(this.base)
        .multiply(BigDecimal.valueOf(this.height)).divide(BigDecimal.valueOf(2))
        .doubleValue();
  }


  public static void main(String[] args) {
    Triangle triangle = new Triangle(3.0, 4.0);
    System.out.println(triangle.area()); // 6.0

    Triangle triangle2 = new Triangle();
    triangle2.setHeight(3);
    System.out.println(triangle2.height);


  }

}


