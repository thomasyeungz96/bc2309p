import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class DemoForEach {
  public static void main(String[] args) {
    String[] strings = new String[] {"abc", "def", "ijk"};

    // For-each supports array and list
    for (String s : strings) {
      System.out.println(s);
    }

    // List.of() Just for read, update. Cannot add or remove
    List<String> list1 = List.of("abc", "def", "ijk");
    List<String> list2 = new ArrayList<>(List.of("abc", "def", "ijk"));
    for (String s : list2) {
      System.out.println(s);
    }

    Consumer<String> consumer = new Sysout();
    list2.forEach(consumer);

    Consumer<String> consumer2 = x -> System.out.println("hello " + x);
    list2.forEach(consumer2);

    // Consumer means, return nothing
    // Consumer: x -> {}
    list2.forEach(x -> {
      System.out.println("hello " + x);
    });

  }
}
