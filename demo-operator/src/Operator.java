public class Operator {
  public static void main(String[] args){
    // + - * /
    // ++

    // --
    int i = 0;
    i = i -1; // -1
    i -= 1; //-2
    i--; //-3
    --i; //-4

    // ++, -- precedence
    int x = 0;
    int result = x++; //奇怪野黎，非正確做法
    System.out.println("result=" + result); // 0
    System.out.println("x=" + x); //x=1

    // result = x; // result = 0， 標準做法
    // x++; // x=1

    int y = 0; 
    int result2 = ++y;
    System.out.println("result2=" + y + result2); //result2=1
    System.out.println("y=" + y); // y=1
    
    int j = 0;
    int result3 = j--;
    
    System.out.println("result3=" + result3); //0
    System.out.println("j=" + j); //-1
    System.out.println("j=" + j); //-1

    int k = 0;
    int result4 = --k;
    System.out.println(result4); //-1
    System.out.println(k); //-1

    // % operator
    int r = 5 % 2; // 5 除 2 餘數係1 the remainder of 5 /2 
    System.out.println(r); //1

    int w = 10 % 6 + 4 * 8; 
    System.out.println(w); // 36

    // && || 
    boolean b = true && true; // true
    boolean b2 = true && false; // false
    boolean b3 = false && true;  // false 
    boolean b4 = false && false; // false

    boolean b5 = true || true; // true
    boolean b6 = true || false; // true
    boolean b7 = false || true;  // true 
    boolean b8 = false || false; // false

    // 行&&先 再行 or.
    // || -> true || false -> true
    boolean combine = true || false && true; //  true

    System.out.println("combine = " + combine);

   // ! -> Not 代表反轉。 只用於 true false 
    boolean b9 = !false; // true 可以咁樣出現 
    int h = (1 + 2) * 10; // 30
    boolean b10 = !(true && false); // true

    // int h2 = [10 - (1 + 2)] * 4;
    int h2 = (10 - (1 + 2)) * 4; //28

    System.out.println("h2=" + h2);

    // >, <, >= , <=
    boolean g = 5 > 3; // true
    boolean g2 = 5 >= 6; // false
    boolean g3 = -1 < 1; //true
    boolean g4 = -2 <= -3; // false

    // == -> check if the values are same in both sides, "check"
    // = 係assignment 
    // != -> Not equals to 
    boolean combine2 = (4 + 3) > 5 || (10 * 2) % 3 ==2; // true || true -> true
    System.out.println("combine2=" + combine2);
    boolean combine3 = !(5 % 2 ==1) && 10 * 3!= 20; // fase && true -> false
    System.out.println("combine3=" + combine3);

    //  *=, /=, %=
    int a = 2;
    a *= 3; // a = a *3;

    System.out.println("a=" + a); // 6
    int f = 3;
    f /=1; // f = f /1;  
    System.out.println("f=" + f); // 3
    int e = 10;
    e %= 3; 
    System.out.println("e=" + e); // 1 
  }


  
}
