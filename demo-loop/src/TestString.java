public class TestString {
  
  public static void main (String[] args) {
    String str1 = "abcd";
    String str2 = "xcyz";

    // print true/ false
    // question: check if two String has a common character
    //
    boolean common = false;
    
   outerLoop: for (int i = 0; i < str1.length(); i++){
      for (int j = 0; j < str2.length(); j++){
        if(str1.charAt(i) == str2.charAt(j)) {
          common = true; 
          break outerLoop; // break inner loop
        }
        }
       }
         System.out.println(common);
      }
    }

