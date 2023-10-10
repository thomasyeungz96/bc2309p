public class StringTest {
  
  public static void main(String[] args) {
    
    String str = "hello";  // str -> stack , "hello" is an String object in heap

    String str2 = new String("hello"); 

    String str3 = str2; 

    String str4 = "hello"; 
    String str5 = "hello!"; 

    System.out.println(str.equals(str2));// compare the value inside the object
    System.out.println(str == str2); // checking if same object in heap; different oject
    System.out.println(str3 == str2); // same object
    System.out.println(str == str4);  // same object
    System.out.println(str == str5); // different object

    System.out.println(str5);
  }


}
