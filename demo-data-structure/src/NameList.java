// Design a Class (Node), link up another Node object

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NameList {

  private String id;

  private NameList next;

  public NameList() {

  }

  public NameList(String id) {
    this.id = id;
  }

  public NameList getNext() {
    return this.next;
  }

  public void add(NameList next) {
    this.getLast().next = next;
  }

  public void add(String id) {
    this.getLast().next = new NameList(id);
  }

  public NameList getLast() {
    NameList head = this;
    while (head.getNext() != null) { // if head.getNext() == null, exit
      head = head.getNext();
    }
    return head;
  }

  public int size() {
    int count = 1;
    NameList head = this;
    while (head.next != null) { // if head.next == null, exit
      head = head.next;
      count++;
    }
    return count;
  }

  public String remove(String id) {
    if (this.id.equals(id)) {
      this.id = this.next.id;
      this.next = this.next.next;
      return id;
    }
    NameList head = this;
    while (head.next != null) { // if head.getNext() == null, exit
      if (head.next.id.equals(id)) {
        head.next = head.next.next;
        return id;
      }
      head = head.next;
    }
    return null;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder(this.id);
    NameList head = this;
    while (head.next != null) {
      sb.append(" -> ").append(head.next.id);
      head = head.getNext();
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    NameList node1 = new NameList("John"); // node1 -> node2
    System.out.println("node1 ref=" + node1);
    NameList node2 = new NameList("Mary");
    System.out.println("node2 ref=" + node2);

    node1.add(node2);

    NameList node3 = new NameList("Peter");
    System.out.println("node3 ref=" + node3);

    node2.add(node3);

    // Go to tail
    NameList head = node1;
    while (head.getNext() != null) { // if head.getNext() == null, exit
      head = head.getNext();
    }

    System.out.println("List tail=" + head);
    System.out.println("List tail' id=" + head.id);

    // Custom List of String, implemented by LinkedList mechanism
    NameList nl = new NameList("IJK");
    nl.add("ABC");
    nl.add("DEF");
    nl.add("XYZ");
    System.out.println("size=" + nl.size()); // 4

    // Before Removing
    System.out.println(nl.toString());
    // After Removing
    nl.remove("DEF");
    System.out.println(nl.toString());
    // After Removing
    nl.remove("XYZ");
    System.out.println(nl.toString());
    // After Removing
    nl.remove("IJK");
    System.out.println(nl.toString());

    // Compare to LinkedList
    LinkedList<String> nl2 = new LinkedList<>();
    nl2.add("ABC");
    nl2.add("DEF");
    nl2.add("XYZ");
    System.out.println("size=" + nl2.size()); // 3
    nl2.get(nl2.size() - 1); // no array in nl2

    ArrayList<String> nl3 = new ArrayList<>();
    nl3.add("ABC");
    nl3.add("DEF");
    nl3.add("XYZ");
    nl3.get(nl3.size() - 1); // arr[arr.length-1]

    List<String> nl4 = new ArrayList<>();
    nl4 = new LinkedList<>();
    // Compile time in Java: List<String> determine which methods can be invoked
    // Run time in Java: nl4 will know which object it points to. ArrayList or LinkedList object?
    nl4.add("ABC"); 
    nl4.remove(0);
    
    System.out.println(nl4.size()); // 0

  }

}
