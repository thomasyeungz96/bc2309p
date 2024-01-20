package animal;

public abstract class Animal2 {

  private double weight;

  private double height;

  public Animal2() {

  }

  public Animal2(double weight, double height) {
    this.weight = weight;
    this.height = height;
  }

  // 2. abstract class can be with abstract method or normal method
  // but class does not have abstract method.
  public abstract void sound();

  public void sound2() {
    System.out.println("zzz ...");
  }

  public double getHeight() {
    return this.height;
  }

  public double getWeight() {
    return this.weight;
  }

  public static void main(String[] args) {
    // Difference between class and abstract class

    // 1. class can new object, but abstract class cannot new object
    Animal animal = new Animal(13.0d, 20.3d);
    // Animal2 animal2 = new Animal2();



  }
}
