public class StringBuilderTest {

  public static void main(String[] args) {

    StringBuilder s = new StringBuilder(); // constructor

    s.append("hello"); // stringBuilder is obj ref. apped is instance method
    // apend is a mehtod
    s.append("world");
    System.out.println(s.toString()); // helloworld


    s.append(" ").append("something").toString();
    s.append(" ").append("something").toString();

    System.out.println(s.append(" ").append("something").toString());// hellowworld something
    System.out.println(s.toString());// hellowworld something
    System.out.println(s.append(" ").append("something").toString());// hellowworld something

    // 1 - 10, even number, by using StringBuilder

    String s3 = "";
    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 0)
        s3 += String.valueOf(i);
    }
    System.out.println("s3=" + s3);//

    // StringBuilder is faster than the String +=
    // method 2

    StringBuilder s2 = new StringBuilder(); // constructor

    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 0) {
        s2.append(i);
      }
    }

    System.out.println(s2.toString());
    s2.reverse();
    System.out.println(s2);

    





    



  }
}
