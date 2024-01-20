package javafuncinterface;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class DemoFunction {
  public static void main(String[] args) {
    // R apply(T t)
    Function<Integer, String> convertFunction = x -> {
      return String.valueOf(x);
    };

    System.out.println(convertFunction.apply(10)); // "10"

    // R apply(T t, U u)
    BiFunction<String, String, String> concat = (s1, s2) -> {
      return s1.concat(s2);
    };

    System.out.println(concat.apply("hello", "world")); // helloworld

    // Example
    Map<String, Integer> nameLengthMap = new HashMap<>();
    nameLengthMap.put("John", 10);
    nameLengthMap.put("Mary", 1000);

    System.out.println(nameLengthMap.get("Tommy")); // null

    // put("Tommy"), length
    System.out.println(nameLengthMap.computeIfAbsent("Tommy", s -> s.length())); // 5
    System.out.println(nameLengthMap.size()); // 3

    System.out.println(nameLengthMap.computeIfAbsent("Mary", s -> s.length())); // 1000
    System.out.println(nameLengthMap.get("Mary"));

    nameLengthMap.merge("Mary", 4, (v1, v2) -> v1 * v2);
    System.out.println(nameLengthMap.get("Mary")); // 4000

    nameLengthMap.merge("Jenny", 7, (v1, v2) -> v1 * v2);
    System.out.println(nameLengthMap.get("Jenny")); // 7


  }
}
