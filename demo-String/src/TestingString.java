public class TestingString {
  
  public static void main(String[] args){
    String str = "abc" ;

    // equals() -> method  開工具
    // String can use methods
    // .lenght -> 結果係 "int" put number
    // .equals ->  結果係 "boolean"

      if ("abc".equals(str)) { 
        System.out.println("it is abc");
      }
      boolean result = "abc".equals(str);

      if (result) { // if (result == true)
        System.out.println("it is abc");
      }

      if ("abc".length() == 3) {
        System.out.println("length = 3");
      }
      if (str.length() == 3) {   // != == > < 
        System.out.println("length = 3");
      }
      // str -> "abc", 
      // 'a' at position [0]
      // 'b' at position [1]
      // 'c' at position [2]
      // [3] ?? no 
      if (str.charAt(0) == 'a'){
        System.out.println("charAt 0 in String str is a");
      } 

      if (str.charAt(1) == 'b'|| str.length() < 3) { // true
        System.out.println("OK");
      }

      float f1 = 100.3f;
      long l1 = 2200000000L;  //  加L 要java 唔好理咁多 當long varible 
      double d1 = 1.0; // 1.0d
      byte b1 = 127; 
      
      // convert int 32000 to short 32000
      //  assign short 32000 to s1
      short  s1 = 32000; 

      


    }
}
