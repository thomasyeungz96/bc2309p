public class StringTest {
  public static void main(String[] args) {
    // Approach 1
    String str = "hello"; // str is an object reference in stack
    // "hello" is an String object in heap
    String str2 = new String("hello"); // new keyword -> create an object in heap

    String str3 = str;

    // logic find two string variable with the same value of "hello"
    // so it "reuse" the same object
    String str4 = "hello";
    String str5 = "hello!";

    System.out.println(str.equals(str2)); // true, comparing the value inside objects
    System.out.println(str == str2); // false, checking if they are the same object
    System.out.println(str == str3); // true
    System.out.println(str == str4); // true
    System.out.println(str == str5); // false



  }
}
