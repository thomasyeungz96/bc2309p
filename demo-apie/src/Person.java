public class Person { // Parent Class

  private String name;

  private int age;

  public int s;

  public static String x = "hello";

  public static int getY() {
    return 10;
  }

  // All-args constructor
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Person() {

  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public boolean isNameValid() {
    return this.name.length() <= 10;
  }

  public boolean isElderly() {
    return this.age >= 65;
  }

  public boolean isAdult() {
    return this.age >= 18;
    // boolean isAdult = false;
    // if (this.age >= 18)
    // isAdult = true;
    // return isAdult;
  }

  @Override // Overriding the toString() method in Object.class
  public String toString() {
    return "name=" + this.name //
        + ", age=" + this.age;
  }

  public static boolean isElderly(int age) {
    return age >= 65;
  }

  public static void main(String[] args) {
    Person person = new Person("John", 18);
    System.out.println(person.isAdult()); // true
    Person person2 = new Person("Mary", 17);
    System.out.println(person2.isAdult()); // false

    // Approach 1
    if (person.isAdult()) { // business domain
      System.out.println("This is adult, go to adult process");
    }

    Person person3 = new Person("abcdefghijk", 65);
    System.out.println(person3.isNameValid()); // false
    System.out.println(person3.isElderly()); // true

    System.out.println(isElderly(person3.getAge())); // true
  }

}
