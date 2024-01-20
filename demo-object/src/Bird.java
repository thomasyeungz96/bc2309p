import java.util.Objects;

public class Bird { // implicitly extends Object.class

  private String name;

  private int age;

  private final String color = "Yellow";

  public static Bird valueOf(String name) {
    return new Bird(name);
  }

  public Bird(String name) { // new Bird("John")
    this.name = name;
    // this.color = color;
  }

  public Bird() {

  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getColor() {
    return this.color;
  }

  @Override
  public boolean equals(Object obj) { // b1.equals(b2) -> true
    if (this == obj)
      return true;
    if (!(obj instanceof Bird))
      return false;
    Bird bird = (Bird) obj;
    // return bird.getName().equals(this.name); // Check String by equals(), "John"
    return Objects.equals(bird.getName(), this.name)
        && Objects.equals(bird.getAge(), this.age);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.name, this.age);
  }

  @Override
  public String toString() {
    return "Bird(name=" + this.name + ", color=" + this.color + ")";
  }

  // Final method cannot be Overriden
  public final void fly() {
    System.out.println("this is final fly() method.");
  }

  public static void main(String[] args) {
    Bird bird = new Bird();
    System.out.println(bird.toString()); // Bird(name=null, color=Yellow)

    // if not @Override toString -> Bird@7344699f -> Object Reference

    Object object = new Object();
    object = "123";
    System.out.println(object.getClass()); // class java.lang.String
    object = 3;
    System.out.println(object.getClass()); // class java.lang.Integer
    object = 0.0;
    System.out.println(object.getClass()); // class java.lang.Double
    object = new Bird();
    System.out.println(object.getClass()); // class Bird

    if (object instanceof Bird) { //
      // downcase from Object.class to Bird.class
      Bird b = (Bird) object;
      b.fly();
    } else if (object instanceof String) {
      String s = (String) object; // downcase from Object to String
      System.out.println(s.length());
    } else if (object instanceof Integer) {
      Integer i = (Integer) object;
      System.out.println(i.intValue());
    } else if (object instanceof Double) {
      Double d = (Double) object;
      System.out.println(d.doubleValue());
    }

    object = new int[5][1];


    Integer i1 = Integer.valueOf("100"); // 100
    Integer i2 = new Integer("100"); // 100

    Bird b1 = new Bird("John");
    Bird b2 = Bird.valueOf("John");

    String s = String.valueOf(100);
    System.out.println(s.charAt(0)); // 1

    System.out.println(b1.equals(b2)); // false -> true
    System.out.println(b1.hashCode()); // 71751670
    System.out.println(b2.hashCode()); // 71751670

    b1.setAge(20);
    b2.setAge(10);
    // after setAge
    System.out.println(b1.equals(b2)); // false
    System.out.println(b1.hashCode()); // 71751690
    System.out.println(b2.hashCode()); // 71751680



  }
}
