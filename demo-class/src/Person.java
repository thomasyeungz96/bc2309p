public class Person {

  int age;

  char gender; // 'M' or 'F'

  String firstName;

  String lastName;

  int hkid;

  public void setAge(int age) {
    this.age = age;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setGender(char gender) {
    this.gender = gender;
  }

  public String fullName() {
    return this.firstName + " " + this.lastName;
  }

  public boolean isMale() {
    if (this.gender == 'M')
      return true;
    return false;
  }

  public boolean isElderly() {
    if (this.age > 65)
      return true;
    return false;
  }

  public static String print() {
    return "hello";
  }

  public static void main(String[] args) {
    Book book1 = new Book(); // book1 is an object
    book1.setAuthor("John");
    book1.setNoOfPages(3);
    System.out.println(book1.getAuthor()); // John
    System.out.println(book1.getNoOfPages()); // 3
    Book book2 = new Book(); // book2 is another object
    System.out.println(book2.getAuthor()); // null
    System.out.println(book2.getNoOfPages()); // 0

    Person person = new Person();
    person.setAge(66);
    person.setGender('F');
    System.out.println(person.isElderly()); // true

    if (person.isElderly() && !person.isMale()) {
      System.out.println("this is female erderly");
    }

    System.out.println(book1.toString()); // author=John, noOfPages=3

    Person.print();
    Book.print();
  }
}
