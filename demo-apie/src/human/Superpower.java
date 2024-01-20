package human;

public interface Superpower {

  void fly();

  default void precogitate() {
    System.out.println("I got precogitation power ...");
  }

}
