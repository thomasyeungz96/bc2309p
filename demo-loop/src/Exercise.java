public class Exercise {

  public static void main (String[] args) {

    // sum of 1,2,3,4,5,6,7,8,9,10

int sum = 0;
for (int i = 1; i < 11; i++) {
// sum = sum + i; 
sum += i;
} 
System.out.println(sum); //55 


 // sum of 2,4,6,8,10
 // for loop, if


int total = 0;
for (int i = 1; i < 11; i++) {
  if (i % 2 == 0 ){
      total += i;
  }
}
  System.out.println(total); // 30 

// 1 - 1000
// 1 - 299 (add all even number)
// 300 - 699 (add all odd number)
// 700 - 1000 (add all numbers can be divided by 3)

int s = 0; 
for (int i = 1; i <= 1000; i++){ // 1, 2, ....1000
  if (i < 300) {
    if (i % 2 ==0){
      s += i; 
    }
  } else if (i < 700) {
     if (i % 2 !=0) {
      s += i;
     }
  } else {
      if (i % 3 == 0) {
        s += i;
      }
  }
}
System.out.println(s);
  }
}