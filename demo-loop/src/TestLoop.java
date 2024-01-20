public class TestLoop {
  public static void main(String[] args) {
    int x = 2;
    x *= 2;
    x *= 2;
    x *= 2;
    x *= 2;
    x *= 2;
    x *= 2;
    x *= 2;
    System.out.println(x); // 256

    // loop -> for loop, while loop, do-while loop
    // for( counter; continue criteria; update)
    // Step 1: int i = 0;
    // Step 2: check if i < 7
    // Step 3: x = x * 2; 
    // Step 4: i++; -> i become 1
    // Step 5: check if i < 7
    // Step 6: x = x * 2;
    // Step 7: i++; i become 2
    // ....
    // Step n: i++; -> i become 6
    // Step n+1: check if i < 7
    // Step n+2: x = x * 2;
    // Step n+3: i++; -> become 7
    // Step n+4: check if i < 7 -> false -> exit loop
    x = 2;
    for (int i = 0; i < 7; i++) { // 0, 1, 2, 3, 4, 5, 6
      x = x * 2;
      System.out.println(x); // print 7 times
    }
    System.out.println(x); // 256

    // for (byte b = 0; b < 128; b++) { // infinite loop
    //   System.out.println(b); // 0 .. 127
    //   // when b = 127 -> b++ -> -128 -> -128 < 128 ?? true
    // }

    for (byte b = 0; b >= 0; b++) {
      System.out.println(b);
      // when b = 127 -> b++ -> -128 -> -128 >= 0 ?? false
    }

  }
}
