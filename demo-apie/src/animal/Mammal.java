package animal;

// abstract class can extend abstract class
public abstract class Mammal extends Animal2 {
  
  // attributes

  public Mammal() {
    
  }

  public Mammal(double weight, double height) {
    super(weight, height);
  }

  public abstract void sound();

}
