public class StringDemo {


  public static void printString(String str){
  // no return that use "void" to be return type. 

    if (str.length() > 3) {
      return; // that means > the length of "str" > 3 that leave out. othewise run the next statement.
    }
    System.out.println("str=" + str);
  }

  public static String print(String str) {
        return str + "world";
  }

  public static int print2(String str) {
    return str.length();
  }

  public static String print(String str1, String str2){
    // early return
    if (!str1.equals(str2)) {
      return str1 + str2; 
    } // } else {1
    if (str1.length()> str2.length()){
        return str1;
      }
    return str2; 
  }

  public static  void main(String[] args){

    System.out.println(StringDemo.print("hellow"));
    System.out.println(StringDemo.print2("hellow")); 
    System.out.println(StringDemo.print("a", "b"));
    StringDemo.printString("abc");
    

  }
}
