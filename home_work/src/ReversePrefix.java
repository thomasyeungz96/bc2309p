import java.util.*;

public class ReversePrefix {

  public static void main(String[] args) {

    do {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("input the value");
      String input = keyboard.nextLine();
      System.out.println("input the char");
      String input2 = keyboard.nextLine();


      System.out.println(reversPrefix(input, input2.charAt(0)));
      

    } while (true);
  }


  public static String reversPrefix(String word, char ch) {
    int index = word.indexOf(ch);

    StringBuilder sb = new StringBuilder();
    if (index == -1)
      return word;

      for (int i = 0; i < word.length(); i++){
        sb.append(word.charAt(i));
        if (i == index)
        reverse(sb);
      }
      return sb.toString();
  }

  public static void reverse(StringBuilder s){
    char temp = ' ';
    for (int i=0; i < s.length()/2; i++){
      temp = s.charAt(i);
      s.setCharAt(i, s.charAt(s.length() - i -1));
      s.setCharAt(s.length() - i -1, temp);

    }

  }

}

