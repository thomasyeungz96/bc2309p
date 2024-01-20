package human;

public class Superman extends Human implements Superpower, Life {

  private String name;

  public Superman(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public void fly() {
    System.out.println("I am Superman, and flying ...");
  }

  @Override
  public void run() {
    System.out.println("I am running ...");
  }

  @Override
  public void sleep() {

  }

  @Override
  public void eat() {

  }

  @Override
  public void drink() {

  }

  public static void main(String[] args) {
    // Polymorphism
    Superman s = new Superman("Tommy");
    // s is an object reference
    // this object reference is pointing to an Superman Object.

    Human h = new Superman("Mary");
    // Compile time check
    // h.getName(); // No getName from h, as h is object reference declared by Human

    h.run(); // I am running ... (during runtime, the object performs behaviour)
    
  }

}
