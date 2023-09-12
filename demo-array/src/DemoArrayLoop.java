public class DemoArrayLoop {
  public static void main (String[] args) {

    int [] nums = new int[4];
    nums[0] = 100;
    nums[1] = 109;
    nums[2] = 1000;
    nums[3] = 1005;

   for  (int i = 0; i <4; i++){
    System.out.println(nums[i]);
   }

// nums.length -> 4 
   for  (int i = 0; i < nums.length; i++){
    System.out.println(nums[i]);
   }


   // sum
   int sum = 0; 
   for (int i = 0; i < nums.length; i++) {
    sum += nums[i];
   }
   System.out.println("sum=" + sum);

   // find the max value in the array
   int max = -1;
   for (int i = 0; i < nums.length; i++){
    if ( nums[i] > max) {
      max = nums[i];
    } 
  }
   System.out.println("max=" + max);


    // find the min value in the array
    int min = 10000;
   for (int i = 0; i < nums.length; i++){
    if ( nums[i] < min) {
      min = nums[i];
    } 
  }
  System.out.println("min=" + min);

  // find the average value of all the values in the array

    int total = 0;
for (int i = 0; i < nums.length; i++){
  total += nums[i]; 
  }
  double average = total / nums.length;
  System.out.println("average=" + average);

// Print odd number in the array, from the tail of array 

  for (int i= nums.length -1 ; i >=0; i--){
    if(nums[i] % 2 == 1){
      System.out.println("i=" + nums[i]);
    }
  }

  int[] integers = new int[] {100, 3, 10, 5, -100};
  int target = 10;
  // print index of value 10
  for (int i=0; i < integers.length; i++){
    System.out.println("row67=" + i);
    if (integers[i] == target){
      System.out.println("position=" + i);
    }


  // when found 'o', replace it by z
 // print str

  String str = "hello world" ;
  char[] characters = str.toCharArray();

  String str2 = " ";

  for (int i=0; i < characters.length; i++) {
    // System.out.println("i= " + i);
    System.out.println("Original_letter= " + characters[i]);

    if (characters[i] == 'o') {
      characters[i] = 'z';
    }
  }

  for (int i =0; i <  characters.length; i++) {
    System.out.println("after_letter=" + String.valueOf(characters[i]));

      str2 += characters[i]; 
 
      System.out.println("str2_per_line=" + str2);
    }
    System.out.println("String.valueOf()= " + String.valueOf(characters)); // char[] -> String
    System.out.println("str2=" + str2);
  }
}

      // String u = String.valueOf(1); // 1 ->"1" 將 1 變左做String 