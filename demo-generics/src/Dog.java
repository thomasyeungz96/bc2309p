import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Dog extends Animal implements Comparable<Animal> {

  private int age;

  // public static void makeSound(Printer<Animal> animals) {

  // }

  public Dog() {
    // super();
  }

  public Dog(String name, int age) {
    super(name);
    this.age = age;
  }

  @Override
  public int compareTo(Animal animal) {
    return animal.getName().compareTo(super.getName());
  }


  public static <T extends Animal> void makeSound(Printer<T> animals) {

  }

  @Override
  public String toString() {
    return "Dog(age=" + this.age + ", name=" + super.getName() + ")";
  }

  // public static void makeSound(Printer<Dog> animals) {

  // }

  public static void main(String[] args) {
    Printer<Animal> animalPrinter = new Printer<>();
    Printer<Dog> dogPrinter = new Printer<>();

    // animalPrinter = dogPrinter; // cannot be polymorhism
    Printer<String> stringPrinter = new Printer<>();
    // Dog.makeSound(StringPrinter); // NOT OK, T should be in Animal Range
    Printer<Dog> dogPrinter2 = new Printer<>();
    Dog.makeSound(dogPrinter2); // OK
    Dog.makeSound(animalPrinter); // OK

    List<Dog> dogs = new ArrayList<>(
        List.of(new Dog("CBA", 20), new Dog("ABC", 10), new Dog("ZZZ", 3)));

    Collections.sort(dogs);
    System.out.println(dogs);

  }

}
