public class DemoArrayLoop_copy {
  public static void main (String[] args){


  String str = "hello world" ;
  char[] characters = str.toCharArray();

String str2 = " ";
System.out.println("characters.length=" + characters.length);

  for (int i=0; i < characters.length; i++) {
    System.out.println("i= " + i);
    System.out.println("value= " + characters[i]);

    if (characters[i] == 'o') {
      characters[i] = 'z';
    }
  }
    for (int i =0; i <  characters.length; i++) {
    System.out.println("String.valueOf()= " + String.valueOf(characters[i]));

    str2 += characters[i]; 
 
    System.out.println("str2= " + str2);
      System.out.println("String.valueOf()= " + String.valueOf(characters));

  }
 }
}

   