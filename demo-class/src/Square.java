public class Square {

  int length;

  // constructor
  public Square() {

  }

  // All-arguements constructor (arguments -> parameters)
  public Square(int length) {
    this.length = length;
  }

  // setter
  public void setLength(int length) {
    this.length = length;
  }

  // area
  public int area() {
    return this.length * this.length;
  }

  public static int area(int length) {
    return length * length; // int * int -> int
  }

  public void abc() {
    System.out.println("hello. this is abc method.");
  }

  // method signature cannot be duplicated
  // method signature = method name + parameters
  public static void abc(String s) {
    System.out.println("hello. this is static abc method. " + s);
  }

  public static String abc(String s, String s2) {
    System.out.println("hello. this is static abc method. " + s + s2);
    return s + s2;
  }

  public static void main(String[] args) {
    // new Square
    // Approach 1:
    Square square = new Square(); // empty constructor
    square.setLength(3); // assign length into the square object
    System.out.println(square.area()); // 9

    // Approach 2:
    Square square2 = new Square(3);
    System.out.println(square2.area()); // 9

    // Approach 3:
    // static method call
    System.out.println(Square.area(3)); // 9

    // revise square2 length -> 7
    square2.setLength(7);
    System.out.println(square2.area()); // 49

    // difference between instance method and static method
    // Instance method: new object first -> use the instance variables to calculate
    // static method: in and out (no object)

    square.abc(); // print
    square2.abc(); // print

  }

}
