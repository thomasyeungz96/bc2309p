import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPQ {
  public static void main(String[] args) {
    Queue<Integer> pq = new PriorityQueue<>(new SortByIntegerDesc());
    pq.add(40);
    pq.add(20);
    pq.add(15);
    pq.add(150);

    while (!pq.isEmpty()) {
      System.out.println(pq.poll());
    }
    // 150 40 20 15

    Queue<String> pq2 = new PriorityQueue<>(new SortByStringDesc());
    pq2.add("bcd");
    pq2.add("apple");
    pq2.add("banana");
    while (!pq2.isEmpty()) {
      System.out.println(pq2.poll());
    }
    // bcd banana apple

  }
}
