import java.util.List;
import java.util.function.Predicate;

public class Demo {
  public static void main(String[] args) {

    // "s" is an object reference
    // "String" is reference type
    // "hello" is a string object
    String s = "hello";

    // var
    // During the compile time -> "var" -> "String"
    var s2 = "hello"; //
    // s2 = 10; // We cannot re-assign the int value to s2, because s2 is in String type during compile time

    List<String> strings = List.of("abc", "cba");
    for (var str : strings) {
      System.out.println(str.charAt(1));
    }

    // call add()
    var result = add(1, 2); // OK

    Predicate<String> b = s3 -> s3.length() > 10;

  }

  // var cannot be used in input parameter type and output parameter type
  public static double add(int x, int y) {
    return x + y;
  }

  public static double add(double x, double y) {
    return x + y;
  }
}
