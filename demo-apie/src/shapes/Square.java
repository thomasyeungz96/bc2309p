package shapes;

import java.math.BigDecimal;
import java.math.RoundingMode;
import enums.Color;

public class Square extends Shape {

  private double length;

  private Square(int length, Color color) {
    super(color);
    this.length = length;
  }

  @Override
  public double area(RoundingMode mode, int dp) {
    BigDecimal sLength = BigDecimal.valueOf(this.length);
    return sLength.multiply(sLength).setScale(dp, mode).doubleValue();
  }

  public static Square valueOf(int length, Color color) {
    return new Square(length, color);
  }

}
