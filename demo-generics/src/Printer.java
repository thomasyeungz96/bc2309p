import java.util.ArrayList;
import java.util.List;

public class Printer<T> { // extends

  private T x;

  public Printer() {

  }

  public Printer(T x) {
    this.x = x;
  }

  public T getX() {
    return this.x;
  }

  public void setX(T x) {
    this.x = x;
  }

  public static void main(String[] args) {
    Printer<String> stringPrinter = new Printer<>();
    Printer<Integer> integerPrinter = new Printer<>();
    Printer<Double> doublePrinter = new Printer<>();
    Printer<Long> bytePrinter = new Printer<>(); 

    // before Java 1.5
    List objects = new ArrayList<>();
    objects.add("abc");
    objects.add(1);
    objects.add(1.0);
    System.out.println(objects);

    if (objects.get(0) instanceof String) {
      String str = (String) objects.get(0);
      str = str.concat("Abc");
    }

    

  }

}
