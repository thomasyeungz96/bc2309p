import java.util.Arrays;

public class DemoArray2 {
  public static void main(String[] args) {
    //
    // int[] arr = new int[] {10, 4, 2, 100, -3};
    // [-3, 2, 4, 10, 100] -> ascending order sorting
    int[] result = bubbleSort(new int[] {10, 4, 2, 100, -3});
    System.out.println(Arrays.toString(result));
    int[] result2 = bubbleSort(new int[] {-100, -3, -1023, -1, -3});
    System.out.println(Arrays.toString(result2));

    String str1 = "";
    String str2 = "Hello";
    String str3 = " ";

    boolean isBlank1 = str1.isBlank();
    boolean isBlank2 = str2.isBlank();
    boolean isBlank3 = str3.isBlank();

    System.out.println(isBlank1); // Output: true
    System.out.println(isBlank2); // Output: false
    System.out.println(isBlank3); // Output: true
  }

  public static int[] bubbleSort(int[] arr) {
    int max = Integer.MIN_VALUE;
    int idx = -1;
    int temp = -1;
    for (int i = arr.length - 1; i >= 1; i--) {
      max = Integer.MIN_VALUE;
      for (int j = i; j >= 0; j--) {
        if (arr[j] > max) {
          max = arr[j];
          idx = j;
        }
      }
      // swap ...
      if (i != idx) {
        temp = arr[idx];
        arr[idx] = arr[i];
        arr[i] = temp;
      }
    }
    return arr;
  }
}
