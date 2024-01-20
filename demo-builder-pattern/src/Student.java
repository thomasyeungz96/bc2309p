public class Student {

  private String name;

  private int age;

  private char gender;

  private Student(String name, int age, char gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  // public String setName(String name) {

  // }

  public static Student.Builder builder() {
    return new Student.Builder();
  }

  public static class Builder {
    private String name;
    private int age;
    private char gender;

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder age(int age) {
      this.age = age;
      return this;
    }

    public Builder gender(char gender) {
      this.gender = gender;
      return this;
    }

    public Student build() {
      return new Student(this.name, this.age, this.gender);
    }
  }

  public static void main(String[] args) {
    Student student = Student.builder() //
        .name("John") //
        .age(19) //
        .gender('M') //
        .build();
    
    
  }
}
