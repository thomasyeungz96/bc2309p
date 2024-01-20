import java.util.List;
import java.util.Optional;

public class OptionalMethod {

  public static String[] database = new String[] {"xyz", "abc", "ijk"};

  public static List<String> database2 = List.of("xyz", "abc", "ijk", "abc");

  public static List<Person> database3 =
      List.of(new Person("John"), new Person("Mary"), new Person("Cherry"));

  public static void main(String[] args) {
    Optional<Integer> result = OptionalMethod.fromDatabase("mmm");

    // Approach 1: isPresent() + get()
    if (result.isPresent()) {
      System.out.println(result.get()); // 1
    } else {
      System.out.println("Not found.");
    }

    // Approach 2: orElse()
    Integer integer = result.orElse(0);

    // Approach 3: ifPresent()
    result.ifPresent(e -> {
      System.out.println("integer is " + e);
    });

    // Approach 4: orElseThrow
    result.orElseThrow(() -> new RuntimeException());
    System.out.println(result);

  }



  // Common Use Case: Optional<T> as a return type
  public static Optional<Integer> fromDatabase(String s) {
    for (int i = 0; i < database.length; i++) {
      if (s.equals(database[i])) {
        return Optional.of(i);
      }
    }
    return Optional.empty();
  }

  public static Optional<Integer> fromDatabase2(String s) {
    Optional<String> os = database2.stream() //
        .filter(e -> "abc".equals(e)) // "abc"
        .findFirst();
    if (!os.isPresent()) {
      return Optional.of(-1);
    }
    return Optional.of(database2.indexOf(os.get()));
  }

  // findFirst()
  public static Optional<Person> fromDatabase3(String name) {
    // Find Person by name in database3
    if (name == null) {
      throw new IllegalArgumentException();
    }
    return database3.stream() //
        .filter(e -> name.equals(e.getName())) //
        .findFirst();
  }

}
