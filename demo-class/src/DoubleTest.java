import java.math.BigDecimal;
import java.math.RoundingMode;

public class DoubleTest {


  public static void main(String[] args) {


    double d1 = 0.1;
    double d2 = 0.2;

    System.out.println(d1 + d2); // 0.30000004
    System.out.println(0.3 - 0.1); // 0.1999999

    BigDecimal bd = new BigDecimal(String.valueOf(0.3)); // bd object reference
    BigDecimal bd2 = new BigDecimal(String.valueOf(0.1));
    BigDecimal bd3 = new BigDecimal(String.valueOf(0.2));
    BigDecimal result = bd.subtract(bd2); // 0.2

    System.out.println("result.doubleValue()= " + result.doubleValue()); //
    BigDecimal result2 = bd3.add(bd2); // 0.4
    System.out.println("result2.doubleValue()= " + result2.doubleValue()); //


    BigDecimal bd5 = BigDecimal.valueOf(10.45678).setScale(2, RoundingMode.UP); 
    System.out.println(bd5); // 10.45678 -> 10.46
    BigDecimal bd6 = BigDecimal.valueOf(10.45678).setScale(3, RoundingMode.DOWN); 
    System.out.println(bd6); // 10.4519 -> 10.451

      if(bd5.equals(bd6)){
        System.out.println("bd5 is equal to bd6");
      }else{
        System.out.println("bd5 is not equal to bd6");
      }

    sumDecimal(0.2, 0.1); 
    subDecimal(0.3, 0.1);

  }

  public static void sumDecimal(double x, double y) {
    double sum = 0;
    sum = x + y;
    System.out.println("sumDecima(" + x + "+" + y + ")= " + sum);
  }

  public static void subDecimal(double x, double y) {
    double sub = 0.0;
    sub = x - y;
    System.out.println("subDecima(" + x + "-" + y + ")= " + sub);
  }

  public static void subDecimalBD(double x, double y) {
    double sub = 0.0;
    sub = x - y;
    System.out.println("subDecima(" + x + "-" + y + ")= " + sub);
  }



}
