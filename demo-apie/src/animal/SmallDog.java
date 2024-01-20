package animal;

public class SmallDog extends Dog2 {
  
  @Override
  public void sound() {
    System.out.println("hello");
  }

  public static void main(String[] args) {
    Dog2 dog2 = new Dog2();
    dog2.sound();

    SmallDog smallDog = new SmallDog();
    smallDog.sound();
  }
}
