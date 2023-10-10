import java.util.Arrays;

public class DemoArray {

  public static void main(String[] args) {

    int i1 = 100;
    int i2 = 105;
    int i3 = 108; // random storage in the ram

    // array
    int[] array; // declaration
    array = new int[3]; // continuously storage next each other

    int[] arr = new int[3]; // 0, 1, 2 三個格仔，index of array used int,thus cannot exceeded 32bits
    // assign values to array
    // arr[-1] = 99; //
    arr[0] = 100;
    arr[1] = 105;
    arr[2] = 108;

    arr[1] = 106; // reassign is okay.
    System.out.println("arr[0]=" + arr[0]);
    System.out.println("arr[1]=" + arr[1]);
    System.out.println("arr[2]=" + arr[2]);

    int o = arr[0];
    System.out.println("o=" + o); // check the arr[0] is int or not.
    // arr[1] = 3L; // error, cannot assign long value to int variable

    // declare int array with size 6, and assign values
    // declare char array with size 4, and assign values

    int[] arr2 = new int[6];

    arr2[0] = 100;
    arr2[1] = 100;
    arr2[2] = 100;
    arr2[3] = 100;
    arr2[4] = 100;
    arr2[5] = 100;
    System.out.println("arr2[0]=" + arr2[0]);

    char[] arr3 = new char[4];

    arr3[0] = 65;
    arr3[1] = 66;
    arr3[2] = 67;
    arr3[3] = 68;

    System.out.println("arr3[0]=" + arr3[0]);
    System.out.println("arr3[1]=" + arr3[1]);
    System.out.println("arr3[2]=" + arr3[2]);
    System.out.println("arr3[3]=" + arr3[3]);

    boolean[] arr4 = new boolean[5];
    arr4[0] = false;
    arr4[1] = true;
    arr4[2] = true;
    arr4[3] = true;
    arr4[4] = true;
    System.out.println("arr4[0]=" + arr4[0]);


    int[] arr5 = new int[] {100, 99, 1005, 2000}; // u cannot change the length of array
    // arr5[3] = 3000;
    // arr5[4] = 30001;

    arr5 = new int[] {1, 2, 3, 4, 5}; // new memory length from 4 to 5
    // swap elements of index 1 and index 3

    int box = -1;

    for (int i = 0; i < arr5.length; i++) {

      if (i == 1) {
        // swap
        box = arr5[i];
        arr5[i] = arr5[i + 2];
        arr5[i + 2] = box;
      }
    }
    System.out.println("arr5=" + arr5); // [I@7344699f
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
        System.out.println("arr5[i] > max");
        System.out.println("arr5[i]=" + arr5[i]);
        System.out.println("max=" + max);
        System.out.println("maxIdx=" + maxIdx);
      }
      if (arr5[i] < min) {
        min = arr5[i];
        minIdx = i;
        System.out.println("arr5[i] < min");
        System.out.println("arr5[i]=" + arr5[i]);
        System.out.println("min=" + min);
        System.out.println("minIdx=" + minIdx);
      }
    }
    temp = arr5[minIdx];
    arr5[minIdx] = arr5[maxIdx];
    arr5[maxIdx] = temp;
    System.out.println(Arrays.toString(arr5)); // [5,4,3,2,1]


    // move max value to the tail of the array
    // [4, 3, 2, 1, 5]
    // Step 1: inde of max value

    max = -1;
    for (int i = 0; i < arr5.length; i++) {
      if (arr5[i] > max) {
        max = arr5[i];
        maxIdx = i;

        System.out.println("max = arr5=" + Arrays.toString(arr5));
        System.out.println("max=" + max);
        System.out.println("arr5[i]=" + arr5[i]);
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
    // outcome: hello -> olleh

    String str = "hello";
    char[] characters = str.toCharArray();
    char temp2 = ' ';

    for (int i = 0; i < str.length() / 2; i++) { // 0,1
      // str.length() =5 , i = 0,1,2
      // i = 0, swap 'h' and 'o'
      // i = 1, swap 'e' and 'l'

      temp2 = characters[i];
      characters[i] = characters[str.length() - 1 - i];
      // when i = 0 , 5-1-0 -> 4
    
      // when i = 1, 5-1-1 ->3
      // when i = 2 , 5-1-2 ->2

      characters[str.length() - 1 - i] = temp2;
    }
    str = String.valueOf(characters);
    System.out.println(str); // olleh

  }
}
