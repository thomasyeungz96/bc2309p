public class Square {

  int length;
  int weight;

  // constructor
  public Square() {}

  // All arguments constructor (arguments -> parameters)
  public Square(int inlength) {
    this.length = inlength;
  }

  // setter for post editing
  public void setLength(int inlenght) {
    this.length = inlenght;
  }

  // area
  public int area() {
    return this.length * this.length;
  }

  public void abc() {
    System.out.println("hello. This is abc method");
  }

  // static method = tools
  public static int area(int length) {
    return length * length;
  }

  // method signaure = method name + parameters. only one
  public static void abc(String inString){
    System.out.println("this is static method for printing "+ inString);
  }
  public static void abc(String inString, String inString2){
    System.out.println("this is static method for printing "+ inString+" "+inString2);
  }


  public static void main(String[] args) {

    // new Square
    // Approach 1:
    Square square1 = new Square(); // empty constructor
    square1.setLength(3); // assign
    System.out.println(square1.length);
    System.out.println(square1.area());// 9

    // Approach 2:
    Square square2 = new Square(3); // second constructor
    System.out.println(square2.length);
    System.out.println(square2.area());// 9
    System.out.println("Square.area()" + Square.area(3));// 9

    // revise square2 length -> 7
    square2.setLength(7);
    System.out.println("square2.length=" + square2.area()); // 49


    square1.abc();
    square2.abc();

    Square.abc("testing");
    Square.abc("testing 2");
  }

}
