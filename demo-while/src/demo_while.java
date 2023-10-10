public class demo_while {
    public static void main(String[] args) {

        //for loop
        for (int i = 0; i <5 ; i++){
            System.out.println("i=" + i);
        } 

        //while loop 
        int j = 0; 
        int k = 10; 
        while (j<5 && k >0 ) {
            System.out.println("j=" +j);
            j++;
            k--;
            System.out.println("hello");
        }

        
        // sum: 1 -10 

        int z = 0;
        int sum = 10;

        while ( z < 11 ){
            sum += z;
            z++;
        }
        System.out.println("sum=" +sum);



        // sum: even number in 1 - 10 x未必進入
        int x = 1; 
        sum = 0;
        while (x <11) {
            if (x % 2 ==0) {
                sum += x;
            }
            // x++; 
        }
        System.out.println(sum);

        // do-white  x 一定要入第一次

        int count = 0;

        do {
            System.out.println("count=" + count);
        } while (++count < 5) ;

        // break
        // 1 - 10 odd number and > 6

        int s = 10;
        while(true) {
            if (s % 2 ==1) {
                System.out.println(s);
            }

        if (--s <= 6) {
            break;
        }
      }

      
    }
}
