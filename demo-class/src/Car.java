public class Car {

  String make;

  String model;

  String year;

  // Empty Constructor of Car
  // After "new Car()", the 3 instance variables do exist inside the object
  public Car() {
    
  }

  // Constructor Signature cannot be duplicated
  // all-arguements constructor
  public Car(String make, String model, String year) {
    this.make = make;
    this.model = model;
    this.year = year;
  }

  public Car(String make, String model) {
    this.make = make;
    this.model = model;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void setYear(String year) {
    this.year = year;
  }

  public String getMake() {
    return this.make;
  }

  public static void main(String[] args) {
    Car c1 = new Car(); // object is created in heap
    c1 = new Car();

    // c1 is object reference (with memory address) -> found the object location 
    // Use the method inside the object to set value, then "abc" is assigned into the object
    c1.setMake("abc"); 
    c1.setModel("xyz");
    c1.setYear("2020");

    Car c2 = new Car();
    System.out.println(c2.getMake()); // null
    c2.setMake("abc");
    System.out.println(c2.getMake()); // abc

    Car c3 = new Car("cba", "ijk", "2023");
    System.out.println(c3.getMake()); // cba

    Car c4 = new Car("ijk", "lkj");
    System.out.println(c4.getMake());

  }
}
