public class DemoArray {
  public static void main (String[] args){

    int i1 = 100;
    int i2 = 105;
    int i3 = 108; // random storage in the ram

      // array
      int[] array; // declaration
      array = new int[3];  // continuously storage next each other

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

    boolean[] arr4 = new boolean [5];
    arr4[0] = false;
    arr4[1] = true;
    arr4[2] = true;
    arr4[3] = true;
    arr4[4] = true;
    System.out.println("arr4[0]=" + arr4[0]);


    int[] arr5 = new int[] {100, 99, 1005, 2000}; // u cannot change the length of array

      arr5[3] = 3000;
      // arr5[4] = 30001;

      arr5 = new int[] {1, 2, 3, 4, 5}; // new memory length from 4 to 5
  }
}
