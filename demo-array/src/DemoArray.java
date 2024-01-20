import java.util.Arrays; //

public class DemoArray {
  public static void main(String[] args) throws Exception {
    int i1 = 100;
    int i2 = 105;
    int i3 = 108;

    // array
    int[] array; // declaration
    array = new int[3]; // initialization

    int[] arr = new int[3]; // 0, 1, 2 -> index of the array
    // assign values to array
    // arr[-1] = 99; //
    arr[0] = 100;
    arr[1] = 105;
    arr[2] = 108;
    // arr[3] = 110; // run-time error

    arr[1] = 106;
    System.out.println(arr[0]); // 100
    System.out.println(arr[1]); // 106
    System.out.println(arr[2]); // 108

    int o = arr[0]; // arr[0] -> int
    System.out.println(o); // 100
    // arr[1] = 3L; // error, cannot assign long value to int variable

    // declare int array with size 6, and assign values
    // declare char array with size 4, and assign values
    int[] arr2 = new int[6];
    arr2[0] = -3;
    arr2[1] = -10000;
    arr2[2] = 90;
    arr2[3] = 90;
    arr2[4] = 90;
    arr2[5] = 0;

    char[] arr3 = new char[4];
    arr3[0] = 'z';
    arr3[1] = 'K';
    arr3[2] = 'p';
    arr3[3] = 'c';

    // boolean array with size 5
    boolean[] arr4 = new boolean[5];
    arr4[0] = false;
    arr4[1] = true;
    arr4[2] = true;
    arr4[3] = true;
    arr4[4] = true;

    int[] arr5 = new int[] {100, 99, 1005, 2000};
    arr5[3] = 3000;
    // arr5[4] = 30001;

    arr5 = new int[] {1, 2, 3, 4, 5}; // 1, 4, 3, 2, 5
    // Swap elements of index 1 and index 3
    int box = -1;
    for (int i = 0; i < arr5.length; i++) {
      if (i == 1) {
        // swap
        box = arr5[i];
        arr5[i] = arr5[i + 2];
        arr5[i + 2] = box;
      }
    }
    System.out.println(arr5); // [I@7344699f
    System.out.println(Arrays.toString(arr5)); // [1, 4, 3, 2, 5]

    // arr5: Swap min and max values
    int max = -1;
    int min = 10000;
    int maxIdx = -1;
    int minIdx = -1;
    int temp = -1;
    for (int i = 0; i < arr5.length; i++) {
      if (arr5[i] > max) {
        max = arr5[i];
        maxIdx = i;
      }
      if (arr5[i] < min) {
        min = arr5[i];
        minIdx = i;
      }
    }
    temp = arr5[minIdx];
    arr5[minIdx] = arr5[maxIdx];
    arr5[maxIdx] = temp;
    System.out.println(Arrays.toString(arr5)); // [5, 4, 3, 2, 1]

    // move max value to the tail of the array
    // Answer: [4, 3, 2, 1, 5]
    // Step 1: index of max value
    max = -1;
    for (int i = 0; i < arr5.length; i++) {
      if (arr5[i] > max) {
        max = arr5[i];
        maxIdx = i;
      }
    }
    // Step 2: loop -> swap. When to start?
    for (int i = 0; i < arr5.length - 1; i++) {
      if (i >= maxIdx) {
        temp = arr5[i];
        arr5[i] = arr5[i + 1];
        arr5[i + 1] = temp;
      }
    }
    System.out.println(Arrays.toString(arr5)); // [4, 3, 2, 1, 5]

    // reverse the string
    // hello -> olleh
    String str = "hello";
    char[] characters = str.toCharArray();
    char temp2 = ' ';
    for (int i = 0; i < str.length() / 2; i++) { // 0, 1
      // i = 0, swap 'h' and 'o'
      // i = 1, swap 'e' and 'l'
      temp2 = characters[i];
      characters[i] = characters[str.length() - 1 - i];
      characters[str.length() - 1 - i] = temp2;
    }
    str = String.valueOf(characters);
    System.out.println(str); // olleh
  }


}
