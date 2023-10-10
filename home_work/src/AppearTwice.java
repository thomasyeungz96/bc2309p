// import java.util.Scanner;

public class AppearTwice {

  public static void main(String[] args) {
    // Scanner keyboard = new Scanner(System.in);
    // System.out.println("input the value");
    // String input = keyboard.nextLine();
    String input = "abcdeefghi";

    // char c1= input.charAt(3);

    repeatChar(input);

    // System.out.println(repeatChar(input));
  }


  public static void repeatChar(String s) {
    int[] chars = new int[26]; // 0 -25
    for (int i = 0; i < s.length(); i++) {
      if (++chars[s.charAt(i) - 'a'] == 2)  
          System.out.println(s.charAt(i));
          else
          System.out.println("not found");
    } 
  }
}
