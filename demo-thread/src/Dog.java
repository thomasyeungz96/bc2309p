public class Dog {

  private String name;

  private static int age;

  public Dog(String name) {
    this.name = name;
  }

  // public void setAge(int age) {
  // this.age = age;
  // }

  public static synchronized void procedure() {
    // code ...
    Dog.age++;
  }

  public void setName(String s) {
    this.name = this.name.concat(s);
  }

  public static void main(String[] args) throws InterruptedException {
    Dog dog = new Dog("");

    Runnable task = () -> {
      for (int i = 0; i < 1000000; i++) {
        dog.setName("A");
        procedure();
      }
    };

    Thread t1 = new Thread(task);
    Thread t2 = new Thread(task);
    t1.start();
    t2.start();

    t1.join();
    t2.join();

    System.out.println(Dog.age);
    System.out.println(dog.name.length());

  }
}
