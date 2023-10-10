public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // conversion between Primitives and Wrapper Classes
        short s1 = 10;
        int i1 = s1; // upcast
        Integer i11 = i1; // int to Interger so called "auto-box"
        int i2 = i11; //un-box 自動轉化

        // error, cannot assign short variable to Integer directly
        // Integer i11 = s1; 
        Integer i12 = (int) s1; // short (cast) -> int (auto-box) -> Integer

        boolean b1 = true;
        Boolean b11= b1; // auto-box 

        char c1 = 'u'; 
        Character c11 = c1; // auto-box

        Float f11 = 9.3f; // auto-box, 9.3f is a float value
        Integer i13= 100; // auto-box, 100 is a int value and than -> Integer
        Long l11 = 5L;  //auto-box, 5L is a long value and than -> Long

        // Wrapper Class has null value (default value)
        // Primitives has default value, int -> 0 double -> 0.0, boolean -> false, char -> '/u0000'

        Integer i15 = null; 

        String s = "hello"; 
        s = null;

        Integer i16 = 8; // new Integer(8);
        Integer i17 = new Integer(8); 
        System.out.println(i16.equals(i17)); //boxed values complare values
        System.out.println(i16.compareTo(8)); //0 
        System.out.println(i16.compareTo(9)); //-1, less than 9
        System.out.println(i16.compareTo(7)); //1, less than 7
        System.out.println(i16 > 7); // true
        System.out.println(i16 == 8); // comparing Integer and int, Integer i16 

    }
}
