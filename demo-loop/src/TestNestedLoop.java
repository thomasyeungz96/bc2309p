public class TestNestedLoop {
 
  public static void main(String[] args) {

    for (int i =0; i < 5; i++) { // "i" working area
    // i = 0 
      for (int j =0; j < 5; j++) { // i = 0 
        // i = 0, j = 0, print i -> 0 
        //J++
        // i = 0, j =1 , print i -> 0
        // ...
        // i = 0, j = 4, print i -> 0 
        System.out.println("i=" + i + ",j=" + j); // 5 * 5
      }
    } // "i" working area
    // when i = 0,
    // Enter Another Loop (J counmter)
    // i = 0, j =0 , print i -> 0
    // J++
    // i = 0, j =0 , print i -> 0
    // j++
    // ...
    // i = 0, j = 4, print -> 0
 
    // i -> 1-10
    // j-> 11-20
    // Print the statement, when i & j are both even number
    // One more condition: j < 15
    for (int i = 1; i <= 10; i++){ // outer loop
      for (int j=11; j <= 20; j++) { // inner loop
        if (j >= 15) {
          break; // break the inner loop 所以行得較快
        }
            if ( i % 2 ==0 && j % 2 ==0 ) {
        System.out.println("i2=" + i + ",j2=" + j);
      }
    }
 }

 // Approach 2:
  for (int i = 1; i <= 10; i++){
      for (int j=11; j <= 20; j++) {
        if (j < 15 && i % 2 ==0 && j % 2 ==0) { // 測試第一樣野是否滿足
          System.out.println("i3=" + i + ", j3=" + j);
        }
      }
    }
 }

}

