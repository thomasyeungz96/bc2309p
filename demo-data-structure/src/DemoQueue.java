import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DemoQueue {
  public static void main(String[] args) {
    // if Linkedlist (Class) has 100 methods
    // if Queue (Interface) has 60 methods
    // if List (Interface) has 40 methods
    Queue<String> strings = new LinkedList<>();
    strings.add("ABC");
    strings.add("IJK");
    strings.add("DEF");
    System.out.println(strings);

    String polledString = strings.poll();
    System.out.println(polledString);
    System.out.println(strings);


    System.out.println(strings.isEmpty()); // false
    int counter = 3; // IJKIJKIJK, DEFDEFDEF
    String polled = "";

    System.out.println("peek()=" + strings.peek()); // Just look up the value of the head of the queue -> IJK

    String head = strings.peek(); // IJK
    int size = strings.size(); // 2
    int queueCount = 0;

    System.out.println(strings);
    while (!strings.isEmpty()) {
      polled = strings.poll();
      strings.add(polled.concat(polled));
      if (++queueCount >= size * 2)
        break;
    }
    System.out.println(strings);
    System.out.println(strings.size()); // 0

    strings.addAll(List.of("XYZ", "MNO"));
    System.out.println(strings);

    System.out.println(strings.contains("MNO")); // true
    for (String s : strings) {
      System.out.println(s);
    }
    strings.remove(); // poll()
    System.out.println(strings);
    strings.remove("XYZ");
    System.out.println(strings);

    // List<String> strs = List.of("A", "B");
    // strs.add("C");
    // System.out.println(strs);

    // Compile-time: obj-ref strings can only call 60 methods in Queue
    // error: strings.indexOf() -> this is method from LinkedList, but not Queue Interface
    List<String> strings2 = new LinkedList<>();
  }
}
