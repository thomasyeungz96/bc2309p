public class DemoArrayLoop {
  public static void main(String[] args) {
    int[] nums = new int[4];
    nums[0] = 100;
    nums[1] = 99;
    nums[2] = 1000;
    nums[3] = 1005;
    for (int i = 0; i < 4; i++) { // 0,1,2,3
      System.out.println(nums[i]);
    }

    // nums.length -> 4
    for (int i = 0; i < nums.length; i++) { // 0,1,2,3
      System.out.println(nums[i]);
    }

    // sum
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
    }
    System.out.println(sum);

    // Find the max value in the array
    int max = -1;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > max) {
        max = nums[i];
      }
    }
    // Find the min value in the array
    int min = 1000000;
    for (int i = 0; i < nums.length; i++) { // times
      if (nums[i] < min) {
        min = nums[i];
      }
    }
    // Find the average value of all the values in the array
    int total = 0;
    for (int i = 0; i < nums.length; i++) {
      total += nums[i];
    }
    double average = total / nums.length;
    System.out.println("The average value=" + average); // 551.0

    // Print odd numbers in the array, from the tail of the array
    for (int i = nums.length - 1; i >= 0; i--) {
      if (nums[i] % 2 == 1) {
        System.out.println(nums[i]);
      }
    }

    //
    int[] integers = new int[] {100, 3, 10, 5, -100};
    int target = 10;
    // print index of value 10
    for (int i = 0; i < integers.length; i++) {
      if (integers[i] == target) {
        System.out.println(i);
      }
    }

    // when found 'o', replace it by z
    // print str -> hellz wzrld
    String str = "hello world";
    char[] characters = str.toCharArray();
    // Approach 1
    String newStr = "";
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'o') {
        newStr += "z";
      } else {
        newStr += str.charAt(i);
      }
    }
    System.out.println(newStr);
    // Approach 2
    String str2 = "";
    for (int i = 0; i < characters.length; i++) {
      if (characters[i] == 'o') {
        characters[i] = 'z';
      }
    }
    for (int i = 0; i < characters.length; i++) {
      str2 += characters[i];
    }
    System.out.println(str2);
    System.out.println(String.valueOf(characters)); // char[] -> String

    String u = String.valueOf(1); // 1 -> "1"


  }
}
