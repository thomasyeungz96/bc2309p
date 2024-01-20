public class Student extends Person { // Child Class
  
  private String studentID;

  public Student() {

  }

  // All-args constructor
  public Student(String studentID) {
    // super(); // calling parent class constructor
    this.studentID = studentID;
  }

  public Student(String name, int age, String studentID) {
    super(name, age);
    this.studentID = studentID;
  }

  public String getStudentID() {
    return this.studentID;
  }

  public void setStudentID(String studentID) {
    this.studentID = studentID;
  }

  public static void main(String[] args) {
    Student student = new Student();
    student.setAge(20);
    student.setName("John");

    Person person = new Person();
    person.setAge(40);
    person.setName("Mary");

    Student student2 = new Student("john", 13, "1234");
    System.out.println(student2.getAge());
    System.out.println(student2.getName());
    System.out.println(student2.getStudentID());

    System.out.println(Person.x); // hello (the best way to call)
    System.out.println(Student.x); // hello
    System.out.println(person.x); // hello
    System.out.println(student2.x); // hello

    System.out.println(Person.getY()); // 10 (the best way to call)
    System.out.println(Student.getY()); // 10
    System.out.println(person.getY()); // 10
    System.out.println(student2.getY()); // 10

    System.out.println(student2.s); // 0


  }

}
