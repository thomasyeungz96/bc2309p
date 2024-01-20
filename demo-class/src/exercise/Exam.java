package exercise;

// Summary (5-Oct)
// - static variable
// - default empty constructor
// - static method can call static variable
// - instance method can call static variable
// - can static method call instance variable??? why???
// - instance method can call instance variable (getter, setter)
// - What is meaning of "no setter" ?
// - what is private ?
public class Exam {

  // Access Modifier: public, private, protected, package-private (default)
  // public -> class, attribute, method, constructor
  // private -> attribute, method, constructor
  // protected -> attribute, method, contructor
  // package-private -> class, attribute, method, constructor
  private Subject[] subjects;

  private static int size = 0;

  private static final int noOfDayOfAWeek = 7; // camel Case


  public Exam(Subject subject) {
    this.subjects = new Subject[100];
    this.subjects[0] = subject;
    size++; // constructor can change the static variable
  }

  public static int getNoOfDayOfWeek() {
    return noOfDayOfAWeek;
  }

  public boolean delete(Subject subject) {
    for (int i = 0; i < this.subjects.length; i++) {
      if (this.subjects[i] != null && subject != null //
          && this.subjects[i].getDescription()
              .equals(subject.getDescription())) {
        this.subjects[i] = null;
        size--;
        return true;
      }
    }
    return false;
  }

  // instance method
  public void add(Subject subject) {
    for (int i = 0; i < this.subjects.length; i++) {
      if (this.subjects[i] == null) {
        this.subjects[i] = subject;
        size++; // instance method can change the static variable
        return; //
      }
    }
    System.out.println("end of add()");
  }

  // Use a static variable to replace the function of size()
  public int size() {
    int count = 0;
    for (int i = 0; i < this.subjects.length; i++) {
      if (this.subjects[i] != null)
        count++;
    }
    return count;
  }

  public double average() {
    double sum = 0;
    for (int i = 0; i < this.subjects.length; i++) {
      if (this.subjects[i] != null)
        sum += this.subjects[i].getScore();
    }
    return sum / this.size(); // int / int -> int, double / int -> double
  }

  public static int getSize() {
    return size;
  }

  public static void main(String[] args) {
    Subject subject = new Subject("ABC", 89);
    System.out.println(subject.getGrade());

    System.out.println(
        "Static method,Exam.getNoOfDayOfWeek()=" + Exam.getNoOfDayOfWeek());
  }

}
