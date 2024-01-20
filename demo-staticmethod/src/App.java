public class App {
  public static void main(String[] args) { // static method, JVM -> static method main
    int x = 2;
    for (int i = 0; i < 10; i++) {
      x *= 2;
    }
    x = 10;
    for (int i = 0; i < 10; i++) {
      x *= 2;
    }

    int result = add(2, 3);
    System.out.println(result); // 5
    result = add(10, 1000); 
    System.out.println(result); // 1010
    result = add(101, 1000); 
    System.out.println(result); // 1101

    short r = sum(5, 8);
    System.out.println(r); // 26
  }

  // 1st int -> return type
  // add -> method name
  // (int x, int y) -> parameters
  public static int add(int x, int y) { // x = 2, y = 3
    int result = x + y;
    return result;
  }
  // min = 5, max 8 , sum = 26 (5 + 6 + 7 + 8)
  public static short sum(int min, int max) {
    int total = 0;
    for (int i = min; i <= max; i++) {
      total += i;
    }
    return (short) total; // downcast
  }



}
