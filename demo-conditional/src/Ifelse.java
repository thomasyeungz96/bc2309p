public class Ifelse {
  public static void main(String[] args){
    int x = 100;
    if (x < 50){
      System.out.println("x > 50"); 
    }

    x = 39; 
    if (x < 40){
System.out.println("x < 40 is it match with the value of x=" + x); //?
    } else { // x >=40
      System.out.println("x >= 40"); // print 
    }
    x = 13;
    if (x != 80) { // come here first -> false
      System.out.println("x is not equals 80 is it match with the value of x=" + x);
    } else if (x < 80) { // then come here -> false
System.out.println("x is smaller than 80 is it match with the value of x=" + x);
    } else if (x >= 80) { // finally, check if x >=80
      System.out.println("x is larger than or equals to 80 is it match with the value of x=" + x);

    }
    int y = 9; 
    if (y == 9) {
      System.out.println("y=9");
    } else if (y<9) {
      System.out.println("y<9");
    } else { // Y > 9 // 餘下嘅case 落依到
      System.out.println("y>9"); //print
    }

    int a = 10;
    int b =3;
    if (a < 9 || b > 2) { // false || true -> true
      System.out.println("a < 9 or b > 2");
    }
    if (a < 9 && b > 2) { // false && true -> false
      System.out.println("a < 9 and b >2");
    }

    // boolean
    boolean isMale = false; 
    if (isMale){ // means, if (isMale == true)
      System.out.println("i am Male");
    
    } else {
      System.out.println("i am Female"); // print
    }

// char
    char grade = 'A'; 
    if (grade ==){
      System.out.println("it is B");
      { else if (grade == 'c') || grade == 'A') {
        System.out.println("it is C or A"){
      } //2 
          

          }; // 4

  
          // check if a number is a even number
          int num = 10:
          if (num %2 == 0) {
            System.out.println("it is an even number. num=" + num);{
            }
          
            if (num % 2 ==1) {
              System.out.println("it is an odd number");
            }
          }

  }
  
}
