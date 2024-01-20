public class App {
  public static void main(String[] args) throws Exception {
    int[] arr = new int[] {100, 102, 55, 23, 1000};
    // for-loop
    for (int i = 0; i < arr.length; i++) { // counter
      System.out.println(arr[i]);
    }
    // for-each
    for (int num : arr) {
      System.out.println(num);
    }
    // for-each, String[]
    String[] arr2 = new String[] {"abc", "hello", "poll"};
    for (String s : arr2) {
      System.out.println(s);
    }
    
  }
}
