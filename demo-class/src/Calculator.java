public class Calculator {

  int x;

  int y;

  int z;

  public int substract() {
    return this.x - this.y;
  }

  // public static int substract(int x, int y ){
  // return x - y;
  // }



  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }

  public int add() {
    return this.x + this.y;
  }


  public static int add(int x, int y) {
    return x + y;
  }



  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    calculator.setX(100);
    calculator.setY(200);
    System.out.println(calculator.add());

    Calculator calculator2 = new Calculator();
    calculator2.setX(200);
    calculator2.setY(1000);
    System.out.println(calculator2.add());

    Calculator calculator3 = new Calculator();
    calculator3.setX(100);
    calculator3.setY(100);
    System.out.println(calculator3.substract());



    int d = add(10, 3);
    System.out.println("d=" + d);


  }



}
