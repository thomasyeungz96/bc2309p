public class Car {


  String year;

  String make;

  String model;



  // empty constructor of car. if 無依句野，java auto 有
  // after "new Car()", the 3 instance var do exist inside the object
  public Car() {}

  public void setYear(String year) {
    this.year = year;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void getYear() {
    return this.year;
  }

  public void getModel() {
    return this.model;

  }

  public void getMake() {
    return this.make;
  }

}

public static void main(String[] args) {

  Car c1 = new Car();
  c1.setMake("abc");
  c1.setModel("xsd");
  c1.setYear("2022");


  public Car(String make, String model, String year) {
    this.year = year;
    this.make = make;
    this.model = model;


  Car c2 = new Car();


  Car c3 = new Car("cba", "ijk, "2023");

  Car c4 = new Car("dsif", "lskfs");



}
}
