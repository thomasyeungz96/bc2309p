import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Demo {

  private static List<String> strings =
      new ArrayList<>(List.of("IJK", "ABC", "XYZ"));

  public static void main(String[] args) {

    // Method Reference -> Lambda expression
    strings.forEach(System.out::println);

    strings.forEach(e -> System.out.println(e));

    // Function<T, R> Lambda Expression: i -> "hello".charAt(i)
    Function<Integer, Character> charAtFunction = i -> "hello".charAt(i);
    Function<Integer, Character> charAtFunction2 = "hello"::charAt;

    // Comparator Method Reference
    Comparator<String> compareTo = (s1, s2) -> s1.compareToIgnoreCase(s2);
    Comparator<String> compareTo2 = String::compareToIgnoreCase;

    Collections.sort(strings, compareTo2);
    System.out.println(strings); // [ABC, IJK, XYZ]

    // ClassName::new
    Function<String, Integer> newInteger = s -> new Integer(s);
    Function<String, Integer> newInteger2 = Integer::new;

  }
}
