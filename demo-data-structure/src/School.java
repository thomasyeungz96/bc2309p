import java.util.ArrayList;

public class School {

  private ArrayList<Student> students; // Student[] students;

  public School() {
    this.students = new ArrayList<>();
  }

  public ArrayList<Student> getStudents() {
    return this.students;
  }

  public boolean addStudent(Student student) {
    return this.students.add(student);
  }

  @Override
  public String toString() {
    return "School(" //
        + "students=" + this.students.toString() //
        + ")";
  }

  public static void main(String[] args) {
    School school = new School();
    school.addStudent(new Student(15, "Mary"));
    school.addStudent(new Student(16, "Ben"));
    System.out.println(school.toString()); // School(students=[Student(age=15, name=Mary), Student(age=16, name=Ben)])
  }

}
