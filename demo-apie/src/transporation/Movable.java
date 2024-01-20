package transporation;

public interface Movable { // 合約, contract
  // before Java8, 100% abstraction

  // 1. implicity "public static final"
  String name = "Car";

  // 2. all methods in interface are implicitly "public abstract" (by default)
  Movable move(); // method signature

  void accelerate();

  // after Java 8 - 2014
  // implicitly public (instance method)
  default void printWinner(String name) {
    System.out.println(name + " is Winner.");
  }
  // implicitly public (static method)
  static void staticPrintWinner(String name) {
    System.out.println(name + " is Winner.");
  }

}
