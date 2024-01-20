public class StringConcat {
  public static void main(String[] args) {
    // Approach 1 (with return)
    // If there are more than 1 line of code, we use code block
    // then we should have "return"
    Concat concat1 = (x, y) -> {
      String result = x + y;
      return result;
    };

    // Approach 2 (without return)
    // One line of code
    Concat concat2 = (x1, x2) -> x1 + x2;

    // Execution
    System.out.println(concat1.concat("hello", "world")); // helloworld


  }
}
