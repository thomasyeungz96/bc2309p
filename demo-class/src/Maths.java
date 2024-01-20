public class Maths {
  public static void main(String[] args) {
    System.out.println(Math.min(19, 7)); // 7
    System.out.println(Math.max(4, 7)); // 7
    System.out.println(Math.abs(-7)); // 7
    System.out.println(Math.abs(7)); // 7
    System.out.println((int) Math.pow(2, 10)); // 1024
    System.out.println(Math.sqrt(8)); // 2.8284271247461903
    System.out.println(Math.floor(9.9)); // 9.0
    System.out.println(Math.ceil(9.2)); // 10.0

    System.out.println(Maths.pow(2.0, 2)); // 4.0
    System.out.println(Maths.pow(3.0, 4)); // 81.0
    System.out.println(Maths.pow(3.0, 1)); // 3.0
    System.out.println(Maths.min(3, 1)); // 1
    System.out.println(Maths.min(3, 3)); // 3
    System.out.println(Maths.min(3, 7)); // 3

    System.out.println(Math.round(5.44)); // 5
    System.out.println(Math.round(5.45)); // 5
    System.out.println(Math.round(5.5)); // 6

    System.out.println((int) (Math.random() * 1000)); // 0 - 1 (0.4878400916270028)
  }

  public static int min(int a, int b) {
    // if (a > b)
    //   return b;
    // return a;
    return a > b ? b : a;
  }

  public static double pow(double base, int power) { // assume power >= 0
    if (power < 0)
      return 0.0;
    if (power == 0)
      return 1.0;
    double result = base;
    for (int i = 2; i <= power; i++) {
      result *= base;
    }
    return result;
  }
}
