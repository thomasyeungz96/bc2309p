public class foreach {
    public static void main(String[] args) {
  

        int[] arr = new int[] {100 , 200, 300, 400, 500, 600, 700};

        // for loop
        for (int i = 0; i < arr.length; i++){
            System.out.println("i= " + i);
            System.out.println("arr[i] =" + arr[i]); //攞數值
            System.out.println("length= " + arr.length);
        }

         // for-each
        for ( int num : arr) {
            System.out.println(num); //  同一寫法 for 攞個值
        }

        String [] arr2 = new String[] {"abc" , "hello", "poll"};

        for (String num2 : arr2){
            System.out.println(num2);
        }
        

    }
}
