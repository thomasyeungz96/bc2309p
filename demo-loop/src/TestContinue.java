public class TestContinue {
  
  public static void main(String[] args) {
    // for loop 10 times
    for (int i = 0; i < 10; i++) {
      if (i >= 2) {
        continue; // go to i++
      }
      System.out.println("i1=" + i); // 0, 1
    }

    // 2, 4, 6, 8, 10 -> continue
    for (int i = 1; i <= 10; i++) {
      if (i % 2 ==1) {  // skip "單數"
        continue; 
      }
      System.out.println("i2=" + i); // 0, 1
    }

    
    // charAt, for loop. print a b c d
    String s= "abcd";
    for (int i = 0; i < s.length(); i++) { // i < 4 -> 0, 1, 2, 3
      System.out.println(s.charAt(i));
    }

// what is the position of c?

    for (int i = 0; i < s.length(); i++) { // i < 4 -> 0, 1, 2, 3
      if (s.charAt(i) == 'c') {
        System.out.println(i);
      }
    }
    // find the char 'x', and print the next char of 'x'
    // if not found,m print -1
    String s2 = "ijkxyz";
    boolean found = false;
    char target = ' ';

    for (int i = 0; i < s2.length(); i++) { 
      if (s2.charAt(i) == 'x') {
        target = s2.charAt(i + 1);  //assign 'y' to variable target
        found = true; 
        break; // for leave out the program
      }

    }
    if (found) { // found == true
        System.out.println("target=" + target);
    } else {
      System.out.println(-1);
    }

     }
  }

