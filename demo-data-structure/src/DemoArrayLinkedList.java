import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoArrayLinkedList {
  public static void main(String[] args) {

    // ArrayList add 10,000,000
    List<String> arraylist = new ArrayList<>();

    for (int i = 0; i < 1000000; i++) {
      arraylist.add("test");
    }
    
    long start = System.nanoTime();
    System.out.println(start); // 

    for (int i = 0; i < 1000000; i++) {
      arraylist.remove(0);
    }

    long end = System.nanoTime();
    System.out.println("Execution time=" + (end - start)); // Execution time=1569470459

    // LinkedList add 10,000,000
    List<String> linkedList = new LinkedList<>();
    
    for (int i = 0; i < 1000000; i++) {
      linkedList.add("test");
    }

    start = System.nanoTime();
    System.out.println(start); // 1700293007989

    for (int i = 0; i < 1000000; i++) {
      linkedList.remove(0);
    }

    end = System.nanoTime();
    System.out.println("Execution time=" + (end - start)); // Execution time=4274186917


  }
}
