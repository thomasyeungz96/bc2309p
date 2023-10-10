package exercise;

public class Subject {

  private String description;

  private int score;

  public Subject(String description, int score) {
    this.description = description;
    this.score = score;
  }

  public String getDescription() {
    return this.description;
  }

  public char getGrade(){

    if (this.score >= 90)
      return 'A';
      else if (this.score >= 80)
      return 'B';
      else if (this.score >= 70)
      return 'C';
      else if (this.score >= 60)
      return 'D';
      else 
      return 'F';
  }

  public int getScore() {
    return this.score;
  }

  public static void main(String[] args) {
    // instance method to calculate the average score of the exam
    Subject s1 = new Subject("English", 90);
    Subject s2 = new Subject("History", 50);
    Subject s3 = new Subject("Maths", 30);
    Exam exam = new Exam(s1);
    exam.add(s2);
    exam.delete(s2);
    exam.add(s3);
    System.out.println("getNoofDayOfweek="+exam.getNoOfDayOfweek());

    double averageScore = exam.average();
    System.out.println("averageScore=" + averageScore);


    System.out.println("s3=" + s3);

    // private static variable
    // so, we cannot get the static variable directly
    System.out.println(Exam.getSize());
    // Exam.noOfdayOfAWeek = 23;
    // Exam.size = 10;
  }

}


