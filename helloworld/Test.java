public class Test {


  public static void main(String[] args) {

    String[] strings = new String[3];
    String sum = "";

    for (int i = 0; i < 4; i++) {
      strings[i] = String.valueOf(i);
      sum += strings[i];
    }
    System.out.println(sum);


  }


}
