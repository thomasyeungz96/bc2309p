public class MathsT {

  public static void main(String[] args) {

    System.out.println(Math.min(19, 100));
    System.out.println(Math.max(19, 100));
    System.out.println(Math.abs(-10));
    System.out.println(Math.abs(10));
    System.out.println(Math.pow(2.5, 10)); // 1024
    System.out.println((int) Math.pow(2.5, 10)); // 1024
    System.out.println(Math.sqrt(13)); //
    System.out.println(Math.floor(10.1313131)); //
    System.out.println(Math.ceil(10.1313131)); //

    System.out.println("pow=" + Math.pow(2, 2));
    System.out.println("mathsT pow=" + MathsT.pow(2.0, 3));
    System.out.println("mathsT min=" + MathsT.min(3, 10));


    System.out.println(Math.round(5.44));
    System.out.println(Math.round(5.45));
    System.out.println(Math.round(5.5));

    System.out.println((Math.random() * 1000));
    System.out.println((int) (Math.random() * 1000));

    double r1 = Math.random();
    double r2 = Math.random();

    System.out.println("r1=" + r1 + "\t r2=" + r2);
    System.out.println("r1=" + r1 + "\t r2=" + r2);

  }

  public static int min(int a, int b) {
    // if (a > b)
    // return b;
    // return a;
    return a > b ? b : a;

  }

  // double answer = MathsT.pow( );
  public static double pow(double base, int power) {

    if (power < 0) {
      return 0.0;
    }

    if (power == 0) {
      return 1.0;
    }

    double result = base;

    for (int i = 2; i <= power; i++) {
      result = result * base;
    }

    return result;

  }

}
