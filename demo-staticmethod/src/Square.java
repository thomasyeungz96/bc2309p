public class Square {

  public static short area(int length) {
    return (short) (length * length); // int * int downcase to short. may 精度捐失
  }
  // return a var, which type should match the method return

  public static int area2(int length) {
    return length * length;
  }

  public static double area3(int length) { // 2 * 2 -> 4.0
    return Math.pow(length, 2); // Math.pow() is double.
  }

  public static int max(int[] arr) {
    int max = -1;
    for (int i = 0; i < arr.length; i++) {
      max = Math.max(arr[i], max);
    }
    // if (arr[i] > max){
    // max = arr[i];
    // }
    return max;
  }

  //
  // }

  public static void main(String[] args) {


    Square.area2(10); // 100
    System.out.println(Square.area2(10)); // 100
    System.out.println(Square.area2(100)); // 10000

    int x = 10;
    int area = -1;

    if (x > 8) {
      area = Square.area2(x);
    } else {
      area = (int) Square.area3(x);
    }

    // max()

    int[] integers = new int[] {100, 1331, 5, 20, 191314};
    System.out.println(Square.max(integers));

  }
}


