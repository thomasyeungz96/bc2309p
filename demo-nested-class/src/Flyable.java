// @FunctionalInterface
public interface Flyable { // FunctionalInterface

  void fly();

  // void read();

  public static void main(String[] args) {
    Flyable f = new Superman();

    // Chapter 27 - Anonymous Inner Class
    Flyable f2 = new Flyable() {
      @Override
      public void fly() {
        System.out.println("Im flying 2 ...");
      }
    };

    // Lambda -> "() ->" just like "new"
    Flyable f3 = () -> {
      System.out.println("Im flying 3 ...");
    };

    Readable r1 = () -> {

    };

  }

}
