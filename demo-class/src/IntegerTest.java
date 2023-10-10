public class IntegerTest {

  public static void main(String[] args) {

    Integer i1 = 127; // auto-box int -> Integer
    Integer i2 = 128;
    Integer i3 = 127;
    Integer i4 = 128;


    System.out.println(i1.equals(127));// compare value
    System.out.println(i1 == 127);// True
    System.out.println(i2 == i4); // falus out of -128 to 127, new the object of "128"
    System.out.println(i1 == i3); // True because same cache 

    // Internal Cache (Byte, Short, Integer, long), -128 to 127

    // Integer: valueOf vs new
    Integer i5 = 5; 
    Integer i6 = new Integer(5); // no need new. because it has been new already. 
    Integer i7 = Integer.valueOf(5); 
    Integer i8 = Integer.valueOf(5);  // reuse the object of i7. cache


    Long l1 = 3L; // auto-box.
    Long l2 = Long.valueOf(3); // upcat int -> long -> Long
    
    Short s1 = Short.valueOf("3"); 
    Short s2 = Short.valueOf((short) 3); 

    double d1 = Double.valueOf(3.4f);
    float f1 = Float.valueOf((float) 3.5d); 


    String.valueOf(0); 
  }

}
