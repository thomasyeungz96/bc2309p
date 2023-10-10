public class Person {

  int age;

  String gender; // 'M' or 'F'

  String firstName;

  String lastName;

  int hkid;

  public void setAge(int age) { // no static here
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getGender() {
    return this.gender;
  }

  public void setFirstname(String fristname) {
    this.firstName = fristname;
  }

  public String getFirstname() {
    return this.firstName;
  }

  public void setLastname(String lastname) {
    this.lastName = lastname;
  }

  public String getLastname() {
    return this.lastName;
  }

  public String fullname() {
    return this.firstName + " " + this.lastName;
  }

  public boolean isMale() {
    if (this.gender.equals("M"))// 'M' is char , String 用.equals
      return true;
    return false;
  }



  public boolean isElderly() {
    if (this.age > 65)
      return true;
    return false;
  }

  public static void main(String[] args) {

    Person person2 = new Person();
    person2.setAge(65);
    person2.setGender("M");
    person2.setFirstname("Thoams");
    person2.setLastname("Yeung");
    System.out.println(person2.isElderly()); // false

    System.out.println(person2.getGender());
    System.out.println(person2.getFirstname());
    System.out.println(person2.getLastname());

    if (person2.isElderly() && !person2.isMale()) {
      System.out.println("this is female erderly");
    }
  }
}

