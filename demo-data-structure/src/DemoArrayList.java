import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoArrayList {
  public static void main(String[] args) {
    // Array - kind of data structure
    String[] strings = new String[5]; // fixed size

    for (int i = 0; i < 5; i++) {
      strings[i] = "hello";
    }
    // strings[5] = "hello"; // java.lang.ArrayIndexOutOfBoundsException

    // ArrayList.class,
    ArrayList<String> strings2 = new ArrayList<>(); // Variable size
    strings2.add("hello"); // array is removed, and new another array
    strings2.add("hello");
    strings2.add("hello");
    strings2.add("hello");
    strings2.add("hello");
    // for-each
    for (String s : strings2) {
      System.out.println(s);
    }

    // ArrayList -> 1 - 10, print out the elements
    // Store the numbers which can be divided by 3
    // while loop
    ArrayList<Integer> integers = new ArrayList<>();
    int i = 0;
    while (++i <= 10) {
      // integers.add(Integer.valueOf(i));
      if (i % 3 == 0)
        integers.add(i); // i -> primitive -> Wrapper class (auto-box)
    }
    for (Integer integer : integers) {
      System.out.println(integer);
    } // 3 6 9

    // ArrayList considers ordering
    // set()
    integers.set(1, 10); // update the 2nd element
    for (Integer integer : integers) {
      System.out.println(integer);
    } // 3 10 9

    // get()
    System.out.println(integers.get(2)); // 9

    // size()
    System.out.println(integers.size()); // 3

    // add null
    integers.add(null);
    System.out.println(integers.size()); // 4

    // isEmpty
    System.out.println(integers.isEmpty()); // false

    // remove() by index
    integers.remove(2); // remove the 3rd object - 9
    System.out.println(integers.size()); // 3
    System.out.println(integers.get(0)); // 3
    System.out.println(integers.get(1)); // 10
    System.out.println(integers.get(2)); // null

    // remove() by object
    integers.remove(Integer.valueOf(10)); //
    System.out.println(integers.size()); // 2
    System.out.println(integers.get(0)); // 3
    System.out.println(integers.get(1)); // null

    System.out.println(integers.contains(3)); // true
    System.out.println(integers.contains(null)); // true
    System.out.println(integers.contains(9)); // false

    System.out.println(integers.subList(0, integers.size())); // 3, null

    ArrayList<Integer> integers2 = new ArrayList<>();
    integers2.add(1000);
    integers2.add(2200);

    // addAll()
    integers2.addAll(integers);
    System.out.println(integers2); // [1000, 2200, 3, null]

    // indexOf
    System.out.println(integers2.indexOf(1000)); // 0
    integers2.add(1000);
    System.out.println(integers2.lastIndexOf(1000)); // 4

    // add(index, element) -> insert
    integers2.add(2, 1500);
    System.out.println(integers2); // [1000, 2200, 1500, 3, null, 1000]

    // removeAll()
    ArrayList<Integer> removeList = new ArrayList<>();
    removeList.add(2200);
    removeList.add(1500);
    integers2.removeAll(removeList);
    System.out.println(integers2); // [1000, 3, null, 1000]

    // Conversion to Array (ArrayList to Array)
    // ArrayList<Integer> -> Integer[]
    Integer[] arr = integers2.toArray(new Integer[0]);
    System.out.println(Arrays.toString(arr));

    Object[] arr2 = integers2.toArray();
    Integer[] result = new Integer[arr2.length];
    int k = 0;
    for (Object obj : arr2) {
      if (obj == null) {
        result[k++] = null;
      } else if (obj instanceof Integer) {
        result[k++] = (Integer) obj;
      }
    }
    System.out.println(Arrays.toString(arr2));
    System.out.println(Arrays.toString(result));

    // List
    ArrayList<String> strings3 = new ArrayList<>();
    List<String> strings4 = new ArrayList<>();

    strings3.add("hello");
    strings4.add("hello");

    strings3.remove("hello");
    strings4.remove("hello");

    System.out.println("strings3=" + strings3);
    System.out.println("strings4=" + strings4);

    // ArrayList.class implementing Interface List
    // So, the method in List must be implemented by ArrayList,
    // but, some methods in ArrayList may not be in List

  }
}
