import java.util.Arrays;

public class DemoArray2 {

  public static void main(String[] arg) {
    int[] arr = new int[] {10, 4, 2, 100, -3};

    int[] result = bubbleSort(new int[] {10, 4, 2, 100, -3});
    System.out.println(Arrays.toString(result));

  }

  // [-3, 2, 4, 10, 100]

  // int temp = -1;

  // for (int i =0; i < arr.length - 1; i++){
  // for (int j = 0; j < arr.length - i -1; j++){
  // System.out.println("i=" +i);
  // System.out.println("j=" +j);
  // if (arr[j] > arr[j + 1]) {
  // temp = arr[j];
  // arr[j] = arr[j + 1];
  // arr[j + 1] = temp;
  // }
  // }

  // System.out.println(Arrays.toString(arr));



  public static int[] bubbleSort(int[] arr) {

    int temp = -1;

    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        System.out.println("i=" + i);
        System.out.println("j=" + j);

        if (arr[j] > arr[j + 1]) {
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    return arr;
  }

}

