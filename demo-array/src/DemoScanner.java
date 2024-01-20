import java.util.Scanner;

public class DemoScanner {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please input a number:");
    int input = scanner.nextInt(); // Get the input from user
    System.out.println("The input=" + input);

  }
}
