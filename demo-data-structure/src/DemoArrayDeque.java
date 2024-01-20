import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DemoArrayDeque {
  public static void main(String[] args) {
    Queue<String> arrayDeque = new ArrayDeque<>();

    // add 1,000,000 strings into queue
    for (int i = 0; i < 1000000; i++) {
      arrayDeque.add("test");
    }

    // arrayDeque.poll()
    long start = System.nanoTime();
    System.out.println(start); //

    while (!arrayDeque.isEmpty()) {
      arrayDeque.poll();
    }

    long end = System.nanoTime();
    System.out.println("ArrayDeque poll() Execution time=" + (end - start)); // Execution time=1569470459

    // arrayDeque.poll()
    Queue<String> linkedListQueue = new LinkedList<>();

    start = System.nanoTime();
    System.out.println(start); //

    while (!linkedListQueue.isEmpty()) {
      linkedListQueue.poll();
    }

    end = System.nanoTime();
    System.out
        .println("linkedListQueue poll() Execution time=" + (end - start)); // Execution time=1569470459

    // Deque / Queue vs Object & Object reference

    Deque<String> deque = (Deque) arrayDeque;
    // 1. No new object.
    // 2. Two object references (Deque & Queue) pointing to the same object (new ArrayDeque)
    // 3. During Run-time, JVM will check if the object fulfill the object reference's type
    // Potentially, run-time error.

    // Typical Type-safty checking, that's why there is no type-safty complain anymore
    if (arrayDeque instanceof Deque<?>) {
      deque = (Deque<String>) arrayDeque;
    }

    Deque<Integer> dequeIntegers = new LinkedList<>();
    Queue<Integer> queueIntegers = dequeIntegers;
    // Because Deque (dequeIntegers) is a child of Queue, compiler ensure queueIntegers can hold the object

    // Deque<String> deque = new ArrayDeque<>();
  }
}
