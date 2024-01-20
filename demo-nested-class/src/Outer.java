public class Outer {

  private String name1;

  private static int value = -20; // Outer.value

  public Outer(String name) {
    this.name1 = name;
  }

  public void display() {
    System.out.println("outer name1="+ this.name1);
  }

  public class InnerClass {

    private String name3;

    public InnerClass(String name3) {
      this.name3 = name3;
    }

    public void display() {
      System.out.println("Outer name1=" + name1 + " , inner name3=" + this.name3);
    }

  }

  public static class NestedClass { // Outer.NestClass

    private String name2;
    private int age;

    public NestedClass(String name) {
      this.name2 = name;
    }

    public void display() {
      // System.out.println(this.name2 + " " + this.name1);
      // Outer class and static nested class not talk to each other

      System.out.println(this.name2 + " " + Outer.value);
    }

  }

}
