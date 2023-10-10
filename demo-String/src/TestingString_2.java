import java.util.Arrays;

public class TestingString_2 {

  public static void main(String[] args) {

    String str = "hello world";
    String[] strs = new String[100];
    String temp = "";
    int j = -1;

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ' ') {
        strs[++j] = temp; //
        temp = "";
        continue;
      }
      temp += str.charAt(i);
    }
    strs[++j] = temp;

    // spilt()
    String[] results = str.split(" ");
    System.out.println(Arrays.toString(results)); // 攞野出黎，not affect the value
    // replace()
    System.out.println(str.replace(" ", "____")); // hellow world -> hellow_world

    System.out.println(compute("str", "str"));
    System.out.println(compute("hellow", "abc"));


  }

  public static String compute(String str1, String str2) {
    // if length of str1 > str2, return str1 + str2, else str2

    if (str1.length() > str2.length())
      return str1.concat(str2); // str1 + str2
    return str2;



  }
}
