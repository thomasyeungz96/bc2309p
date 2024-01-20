public class DemoStringIndexOutOfBound {
  public static void main(String[] args) {
    System.out.println(charAt("hello"));
    // java.lang.StringIndexOutOfBoundsException
  }

  public static char charAt(String s) {
    return s.charAt(s.length());
  }
}
