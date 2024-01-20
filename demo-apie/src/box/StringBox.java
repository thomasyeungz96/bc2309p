package box;

public class StringBox implements CharSequence { // Encapsulation

  private char[] arr; // sample

  // Constructor
  public static StringBox valueOf(String s) {
    return new StringBox(s);
  }

  public StringBox(char[] arr) {
    this.arr = arr;
  }

  private StringBox(String s) {
    // or this.arr = s.toCharArray();
    this.arr = new char[s.length()];
    for (int i = 0; i < s.length(); i++) {
      this.arr[i] = s.charAt(i);
    }
  }

  public StringBox append(String s) {
    // array size
    // new a new char array
    int pos = 0;
    char[] newArr = new char[this.arr.length + s.length()];
    for (int i = 0; i < this.arr.length; i++) {
      newArr[i] = this.arr[i];
      pos = i;
    }
    // s -> newArr
    for (int i = 0; i < s.length(); i++) {
      newArr[++pos] = s.charAt(i);
    }
    // this.arr (object reference -> char[] "sample")
    // newArr (object reference -> char[] "samplesample")
    this.arr = newArr; //
    return this;
  }

  @Override
  public String toString() {
    return String.valueOf(this.arr);
  }

  public StringBox substring(int fromIndex, int toIndex) {
    StringBuilder str = new StringBuilder("");
    for (int i = fromIndex; i < toIndex; i++) {
      str.append(this.arr[i]);
    }
    // str (StringBuilder) -> StringBox
    return new StringBox(str.toString());
  }

  @Override
  public int length() {
    return this.arr.length;
  }

  @Override
  public char charAt(int index) {
    return this.arr[index];
  }

  @Override
  public CharSequence subSequence(int start, int end) { // 1, 4 -> a str of length 3
    if (end == start)
      return "";
    if (end < start)
      return new StringBox(this.arr);
    char[] newArr = new char[end - start];
    for (int i = start; i < end; i++) {
      newArr[i] = this.arr[i];
    }
    return new StringBox(newArr);
  }

  public static void main(String[] args) {
    StringBox stringBox = new StringBox("sample");
    System.out.println(stringBox.length()); // 6
    System.out.println(stringBox.charAt(2)); // m
    System.out.println(stringBox.substring(1, 3).toString()); // am
    System.out.println(stringBox.append("sample").toString()); // samplesample

    StringBox stringBox2 = StringBox.valueOf("hello world"); //
    StringBox stringBox3 = stringBox2.substring(2, 4); //
    stringBox3.append("!!!!!");
    System.out.println(stringBox3.toString());
    System.out.println(stringBox2.toString());

    System.out.println("hello".substring(1, 1).equals("")); // true
    System.out.println("hello".substring(1, 2)); // e
    // System.out.println("hello".substring(2, 1)); // error

    // Polymorphism - Interface
    CharSequence str = "hello world";
    str = new StringBox("hello world");
    System.out.println(str.length()); // 11
    System.out.println(str.toString()); // hello world
    
    String str2 = "abcd";
    System.out.println(str2.length()); // 4
    System.out.println(str2.toString()); // abcd

    String str4 = "5" + 5;
    System.out.println("5" + 5); // 5 -> String
  }

}
