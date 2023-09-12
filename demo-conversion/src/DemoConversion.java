public class DemoConversion {
  public static void main(String[] args) throws Exception {
    // Primitives
    // upcast (promotion)
    // byte -> short -> int -> long (Integer)
    
    byte b = 10;
    short s = b; // upcast: from byte to short
    // byte b2 = s; // error cannot downcast 
    int i = s ; 
    long l = i; 
    int i2 = b; 

   // float -> double
    float f = 10.323f;
    double d = f; // upcast

  // char -> int
    char c = 'a' ; // in ascii 97
    int w = c; // upcast
    System.out.println("w=" + w) ; // 97

    // char c2 = w; // int -> char, error


    // downcast

    short s3 = 127;
    byte b3= (byte) s3;  // forced to downcase

    System.out.println("b3=" + b3); //127

    short s4 = 30000;
    byte b4 = (byte) s4; 
    System.out.println("*b4=" + b4); // Java behavior (overflow): 48   轉30000 次 變 48？ 

    short s5 = 128;
    byte b5= (byte) s5; 
    System.out.println("b5=" + b5);  //-128 

    double d5 = 10.234;
    float f5 = (float) d5 ;
    System.out.println("f5=" + f5);


    short s6 = 32767; 
    s6++ ; 
    System.out.println("*s6=" + s6); //-32768

    //int -> char(6xxxx) (0 -127)
    int i6 = 99; //'c'
    char c6 = (char) i6 ; // forced to conversion
    char c7 = 99; 
    System.out.println("c6=" + c6);
    System.out.println("c7=" + c7);

      char c8 = 'A'; // 65
      char c9 = 'a'; // 97

      if (c8 > c9 ){ // conversion: char -> int，比較左數字
          System.out.println("c8 > c9 in ascii");
      } else {
          System.out.println("c9 >= c8 in ascii");

      }
        byte b9 = 100;
        short s9 = 101;
          if (s9 > b9) { // convertsion: byte -> short
            System.out.println("s9>b9");
          }

  }
}
