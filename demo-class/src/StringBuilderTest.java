public class StringBuilderTest {
  public static void main(String[] args) {
    StringBuilder s = new StringBuilder(); // constructor
    s.append("hello"); // stringBuilder is obj ref
    // append() is a method
    s.append("world");
    System.out.println(s.toString()); // helloworld

    System.out.println(s.append(" ").append("something").toString()); // helloworld something
    System.out.println(s.toString()); // helloworld something
    System.out.println(s.append(" ").append("something").toString()); // helloworld something something

    // 1 - 10, even number, by using StringBuilder
    // result -> "246810"
    StringBuilder s2 = new StringBuilder();
    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 0)
        s2.append(i);
    }
    System.out.println(s2.toString()); // 246810

    StringBuilder sb = new StringBuilder("Hello, World!");

    // Removing specific characters from the StringBuilder
    for (int i = 0; i < sb.length(); i++) {
      char c = sb.charAt(i);
      if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
        sb.deleteCharAt(i);
        i--; // Adjust the index after deletion
      }
    }

    String result = sb.toString();
    System.out.println(result); // Output: HelloWorld
  }
}
