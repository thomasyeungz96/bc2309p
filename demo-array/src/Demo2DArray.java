public class Demo2DArray {

  public static void print(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        if (j == arr[0].length - 1)
          System.out.print(arr[i][j]);
        else
          System.out.print(arr[i][j] + ",");
      }
      System.out.println("");
    }
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (i == arr.length - 1)
        System.out.print(arr[i]);
      else
        System.out.print(arr[i] + ",");
    }
  }

  public static void print(String[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (i == arr.length - 1)
        System.out.print(arr[i]);
      else
        System.out.print(arr[i] + ",");
    }
  }

  public static void main(String[] args) {
    // 1D int array, [1, 3, 10]
    int[] arr = new int[10];
    int[] arr2 = new int[] {1, 3, 10};
    int[] arr3 = {1, 10, 3};

    for (int i = 0; i < arr2.length; i++) {
      System.out.println(arr2[i]);
    }

    // 2D int arrays
    // 1, 3, 10
    // 2, 4, 6
    // 11, 13, 17
    // declare 2D array
    int[][] arr2d = new int[3][3];
    int[][] even2d = new int[3][3];
    int[][] arr2d2 =
        new int[][] {{1, 3, 10, 10}, {2, 4, 6, 2}, {11, 13, 17, 1}};
    int[][] arr2d3 = {{1, 3, 10}, {2, 4, 6}, {11, 13, 17}};

    // print array -> static
    // i -> row
    for (int i = 0; i < arr2d2.length; i++) { // i=0, 1, 2
      // j -> col
      for (int j = 0; j < arr2d2[0].length; j++) { // j=0, 1, 2, 3
        System.out.println("i=" + i + ",j=" + j + ", val=" + arr2d2[i][j]);
      }
    }

    // assign 1, 3, 5, 7, 9 ... (odd number) to arr2d
    int odd = 1;
    for (int i = 0; i < arr2d.length; i++) {
      for (int j = 0; j < arr2d[0].length; j++) {
        arr2d[i][j] = odd;
        odd += 2;
      }
    }
    print(arr2d); // print elements in the 2D array

    // assign 2, 4, 6, 8, 10 ... (even number) to even2d
    int even = 2;
    for (int i = 0; i < even2d.length; i++) {
      for (int j = 0; j < even2d[0].length; j++) {
        even2d[i][j] = even;
        even += 2;
      }
    }

    // product of arr2d and even2d (i.e 1x2, 3x4, 5x6 ...)
    // assumption: arr2d.length == even2d.length, arr2d[0].length == even2d[0].length
    // output result to another array
    int[][] result2d = new int[even2d.length][even2d[0].length];
    for (int i = 0; i < even2d.length; i++) { // i = 0
      for (int j = 0; j < even2d[0].length; j++) { // j = 0, 1, 2
        result2d[i][j] = even2d[i][j] * arr2d[i][j];
      }
    }
    print(result2d);

    int[][][] arr4 = new int[2][2][2]; // 3D array

    // arr2d (3 x 3)
    // 1, 3, 5
    // 7, 9, 11
    // 13, 15, 17
    // convert arr2d to 1d array (1+7+13, 3+9+15, 5+11+17)
    int[] result1d = new int[arr2d[0].length];
    for (int j = 0; j < arr2d[0].length; j++) {
      for (int i = 0; i < arr2d.length; i++) {
        result1d[j] += arr2d[i][j];
      }
    }
    print(result1d);

    char[][] arr9 =
        new char[][] {{'h', 'e', 'l', 'l', 'o'}, {'J', 'o', 'h', 'n'}};

    String[] strArr = new String[arr9.length];
    for (int i = 0; i < arr9.length; i++) {
      strArr[i] = "";
      for (int j = 0; j < arr9[i].length; j++) {
        strArr[i] += arr9[i][j];
      }
    }
    print(strArr);

  }
}
