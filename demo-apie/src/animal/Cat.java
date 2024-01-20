package animal;

public class Cat extends Animal {
  
  private int age;

  public Cat(int age, double weight, double height) {
    super(weight, height);
    this.age = age;
  }

  public String sound() {
    return "Meow";
  }

  public String toString() {
    return "Cat(name=" + this.age + ", Animal(" + super.toString() + "))";
  }

}
