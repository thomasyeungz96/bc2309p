public class DataType {
  public static void main(String[] args) {

    // Assign value "Hellow World!!" to a variable box
    String box = "Hellow World!!! box value 1" ; 
    
    System.out.println(box) ;// Print a variable
    System.out.println("box") ;  // Print the String value: box
    
    String str; //Declaration 聲明 
    box = "Wellcom to Bootcamp box value 2"; //Assignement
    str = "abc"; // Assign value "abc" to a variable str
    System.out.println(str); //abc
    System.out.println(box);  // Wellcom to Bootcamp

    // Primitives, 8 types of total (one kind of data type)
    // int x ="abc"; //Type mismatch: cannot convert from String to intJava(16777233)
    int x = 1;
    int salary = 1000;
    x = 10;
    System.out.println(x); //10

    x = x + 2; // always look at the right hand side
    // 10 + 2, assign 12 back to variable x
    System.out.println(x); //12

    x = x - 8 ; 
    System.out.println(x); // 4 (12 - 8)

    salary = salary + x; 
    System.out.println(salary); // 1004

    int z = salary / 2; 
    System.out.println(z); //502

    int k = z * 5;
    System.out.println(k); // 2510

    int sum = x + salary + z + k; // 4020
    System.out.println(sum); 

    int result = sum + 10 / 2; 
    System.out.println(result); // 4025


  // self + 1 
    int j = 0; 
    j = j + 1; // Approach 1
    j += 1 ; // Approach 2: same as j = j + 1, "= j +" -> "+=" 
    j++; // Approach 3
    ++j; // Approach 4 
    System.out.println(j); //4

    // String str = 1; // Not OK, cannot assign int to String variable
    String s = "hello";
    // s = s / 2; // String cannot divide by 2
    // s = s * 2; 
    // s = s - 3;
    s = s + "world"; // String only supports + operation
    System.out.println(s); // hellow world.

    String str1 = "abc";
    String str2 = "xyz";
    String e = str1 + str2;
    System.out.println(e); //abcxyz
    System.out.println("e=" + e); //e=abcxyz

    //int -> Integer 整數
    // int a = 0.3; // cannot assign decimal to int variable
    double d = 0.3;
    d = 3.1415; 
    System.out.println(d); // 3.1415
    d = d + 0.3 - 0.1 * 2; 
    System.out.println(d); // 3.2415

    double d2 = 3; // assign int to variable d2, then convert int to
    System.out.println(d2); //3.0

    // boolean (true OR false)
    boolean a = true; 
    System.out.println(a); //true
    boolean isLeft = false;  //true
    System.out.println(isLeft); //false
    // String W = true; // cannot assign true/false to String variable 
    // boolean dont support +/-/*// operation
    boolean isMale = true; 

    // char 
    char t = 'a' ;
    System.out.println(t); // a
    //char t = '' ; // at least 1 character
    //char t = 'ab' ; // NOT OK , not more than 1 character, single chacter
    char o = '$'; 
    System.out.println(o); // $

    // byte
    byte b = 1; // Within -128 to 127
    // byte b = -129; // out of range
    // byte b = 128; // out of range
    // b = b + 10; // byte will convert to int 

    // short 
    short sh = 128; 
    // short sh2 = -40000; // not ok, out of range
    // short sh3 = 40000; // not ok, out of range
    int r2 = sh + 100; // 228
    System.out.println("r2=" + r2); // r2=228

    // long (a type has a bigger range than int)
    long l1 = 10000;
    l1 += 20000; // l1 = l1 + 20000; 
    System.out.println(l1); // 30000

    l1 -= 5000; // l1 = l1 - 5000;
    System.out.println(l1); // 25000

    l1 *= 2; // l1 = l1 * 2;
    System.out.println(l1); // 50000

    l1 /= 10; // l1 = l1 / 10;
    System.out.println(l1); // 5000

    // String support +=
    String k2 = "abc"; 
    k2 += "bcd"; // k2 = k2 + "bcd"; 
    System.out.println(k2); // abc bcd

    // float
    int i = 1; // java treat 1 is an integer, not i
    double d4 = 3.0; // java treat 3.0 is a double value
    double d5 = 3.0d; // Explicityly assign a double value
    // float f = 3.0; // NOT OK , assign double value to float value
    float f = 3.0f; 

    // byte, short, int, long -> all of them handle integer
    byte b3 = 3;
    short s3 = 4;
    int i3 = 5; // default int value
    long l4 = 5; // (upcast), you can ignore today
    long l3 = 5L; // Assign long value 5 to a long variable, L 要大寫
    
  }
}