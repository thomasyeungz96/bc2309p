public class StringDemo {

  // Key points:
  // Method Signature: method name + (optional) parameter(s)
  // Method Signature can be duplicated in a class
  // Method Return Type (Class or primitive or Array ...)
  // With Method Code Block: you should always return a value for all scenario
  // The type of return value should match the return type of the method
  // void -> make sure understand why we need "void" in method return type

  public static void printString(String str) {
    if (str.length() > 3)
      return;
    System.out.println("str=" + str);
    System.out.println("str=" + str + str);
  }

  public static String print(String str) {
    return str + "world";
  }

  public static int print2(String str) {
    return str.length();
  }

  public static String print(String str1, String str2) {
    // early return
    if (!str1.equals(str2)) { // if str1 not equals str2
      return str1 + str2;
    }
    if (str1.length() > str2.length()) {
      return str1;
    }
    return str2;
  }

  public static void main(String[] args) {
    System.out.println(StringDemo.print("hello")); // helloworld
    System.out.println(StringDemo.print2("hello")); // 5

    StringDemo.printString("abcde"); // nothing
    StringDemo.printString("abc"); // str=abc, str=abcabc
  }
}
