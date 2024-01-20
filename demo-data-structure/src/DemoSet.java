import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DemoSet {
  public static void main(String[] args) {
    List<String> strings = new ArrayList<>();
    strings.add("hello");
    strings.add("world");
    strings.add("world");

    Set<String> strings2 = new HashSet<>();
    System.out.println(strings2.add("hello")); // true
    System.out.println(strings2.add("world")); // true
    System.out.println(strings2.add("world")); // false
    System.out.println(strings2);

    List<String> strs = List.of("hello", "world", "hello", "hello", "XYZ");
    int count = 0;
    for (String s : strs) {
      if (s.equals("hello"))
        count++;
    }
    // 1. Count duplicated elements
    System.out.println(countTarget(strs, "hello")); // 3
    // 2. Filter out duplicated elements
    List<String> strList =
        new ArrayList<>(List.of("hello", "world", "hello", "hello", "XYZ"));
    filterDuplicated(strList);
    System.out.println(strList); // [world, XYZ, hello]

    Set<String> set = new HashSet<>();
    set.add("abc");
    System.out.println(set.size()); // 1
    
  }

  public static void filterDuplicated(List<String> list) {
    Set<String> strings = new HashSet<>();
    for (String s : list) {
      strings.add(s);
    }
    list.clear();
    for (String s : strings) {
      list.add(s);
    }
  }

  public static int countTarget(List<String> list, String target) {
    // set
    Set<String> strings = new HashSet<>();
    int count = 1;
    for (String str : list) {
      if (!strings.add(str) && str.equals(target))
        count++;
    }
    return count;
  }
}
