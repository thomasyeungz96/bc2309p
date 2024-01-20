public class Employee {

  private String name;

  private static String x = genX();

  public static final int HOURS_PER_DAY = 24;

  public static final double PI = Math.PI;

  static {
    System.out.println("Step 2: static block.");
  }

  {
    System.out.println("Step 3. this is initialization block when you new an object of this class");
    name = "abc";
  }

  public static String genX() {
    System.out.println("Step 1: Start genX()");
    return "1234";
  }

  public Employee(String name) {
    System.out.println("Step 4. this is constructor");
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public static void main(String[] args) {
    System.out.println("start");

    Employee employee = new Employee("John");

    System.out.println("end");
  }

}
