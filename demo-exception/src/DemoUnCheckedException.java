public class DemoUnCheckedException {
  public static void main(String[] args) {

    String s;
    s = "";
    System.out.println(s.length()); // 0

    // Unchecked Exceptions:
    // 1. ArithmeticException (/ by zero)
    // 2. NullPointerException

    // Checked Exceptions:
    int result2;
    try {
      result2 = sum(2, 4);
    } catch (Exception e) {
      result2 = -1;
    }


    int result;
    int x = 0;
    if (x == 0) {
      result = 1;
    } else {
      result = 10 / x;
    }
    // }
    // try {
    // x = 0;
    // result = 10 / x;
    // System.out.println(result);
    // } catch (ArithmeticException e) {
    // result = 1;
    // }

    // Example 1: ArithmeticException
    System.out.println(divide(9, 3)); // 3
    // System.out.println(divide(9, 0)); // java.lang.ArithmeticException

    try {
      // Since divided3 would throw a check exception,
      // so the method caller has to handle the method call by try catch
      result = divide3(9, 0);
    } catch (BusinessException e) {
      System.out.println(e.getFullMessage());
      result = -1;
    }

    // Example 2:
    arrayIndexOutOfBound(new int[10]); //

  }

  public static int sum(int x1, int x2) throws Exception {
    // if (x1 < 0 || x2 < 0)
    // throw new RuntimeException(); //
    if (x1 >= 0 && x2 >= 0)
      return x1 + x2;
    throw new Exception();
  }

  public static int divide(int x, int y) {
    int result = x / y;
    return result;
  }

  public static int divide2(int x, int y) {
    int result;
    try {
      result = x / y;
    } catch (ArithmeticException e) { // Not a must to catch ArithmeticException
      result = 0;
    }
    return result;
  }

  // The method signature need to add "throws exception" if the logic throw checked exception
  public static int divide3(int x, int y) throws BusinessException {
    int result;
    try {
      result = x / y;
    } catch (ArithmeticException e) { // Convert uncheck exception to checked exception
      throw new BusinessException(ErrCode.ARITHMETIC_EXCEPTION);
    }
    return result;
  }

  public static void arrayIndexOutOfBound(int[] arr) {
    arr[arr.length] = 1;
  }
}
