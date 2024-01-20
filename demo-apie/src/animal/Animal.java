package animal;

public class Animal {

  private double weight;

  private double height;

  public Animal(double weight, double height) {
    this.weight = weight;
    this.height = height;
  }

  public double getWeight() {
    return this.weight;
  }

  public double getHeight() {
    return this.height;
  }

  public String toString() {
    return "weight=" + this.weight + ", height=" + this.height;
  }


}
