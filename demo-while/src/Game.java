import java.util.Random;
import java.util.Scanner;

public class Game {
  public static void main(String[] args) {
    // range 1 - 100
    // bomb: 74 (random number)
    // User guess a number between 1 - 100
    // 70
    // User guess a number between 71 - 100
    // 80
    // User guess a number between 71 - 79
    // ...
    // 74 -> bomb

    // which type of loop
    // Bomb (random)
    int min = 1;
    int max = 100;
    int bomb = new Random().nextInt(100) + 1; // 1 - 100
    int input = -1;

    do {
      // How to ask user question?
      Scanner scanner = new Scanner(System.in);
      System.out.println("Input a number between " + min + "-" + max + ":");
      input = scanner.nextInt();
      // Validation
      if (input < min || input > max) {
        System.out.println("Wrong number. Please input again.");
        continue;
      }
      // revise the range for user to pick again
      if (input < bomb) {
        min = input + 1;
      } else if (input > bomb) {
        max = input - 1;
      }
    } while (input != bomb); // compare user input vs bomb
    System.out.println("Congrats, you got the bomb!!!");

  }
}
