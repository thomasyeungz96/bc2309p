import java.math.BigDecimal;
import java.math.RoundingMode;

public class DoubleTest {
  public static void main(String[] args) {
    double d1 = 0.1;
    double d2 = 0.2;
    System.out.println(d1 + d2); // 0.30000000000000004
    System.out.println(0.3 - 0.1); // 0.19999999999999998

    BigDecimal bd = new BigDecimal(String.valueOf(0.3)); // bd -> object reference
    BigDecimal bd2 = new BigDecimal(String.valueOf(0.1));
    BigDecimal result = bd.subtract(bd2); // 0.2
    System.out.println(result.doubleValue());

    // 0.1 * 0.2
    System.out.println(0.1 * 0.2); // Precision issue
    System.out.println(new BigDecimal("0.1").multiply(new BigDecimal("0.2")));

    // 0.3 / 0.1
    System.out.println(0.3 / 0.1); // Precision issue
    System.out.println(new BigDecimal("0.3").divide(new BigDecimal("0.1")));

    // 0.1 + 0.2
    System.out.println(0.1 + 0.2); // Precision issue
    System.out.println(new BigDecimal("0.1").add(new BigDecimal("0.2")));

    System.out
        .println(BigDecimal.valueOf(0.3).subtract(BigDecimal.valueOf(0.1))); // 0.2

    // new or valueOf()
    BigDecimal bd5 = BigDecimal.valueOf(10.45678).setScale(2, RoundingMode.UP);
    System.out.println(bd5); // 10.46

    BigDecimal bd6 = BigDecimal.valueOf(10.4519).setScale(3, RoundingMode.DOWN);
    System.out.println(bd6); // 10.451

    if (bd5.equals(bd6)) {
      System.out.println("bd5 is equal to bd6");
    } else {
      System.out.println("bd5 is NOT equal to bd6");
    }

  }
}
