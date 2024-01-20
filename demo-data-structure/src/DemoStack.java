import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DemoStack {
  public static void main(String[] args) {
    Queue<String> queue = new LinkedList<>();
    queue.add("ABC");
    queue.add("IJK");
    
    Stack<String> stack = new Stack<>();
    stack.push("Hello");
    stack.push("World");
    stack.push("!!!");
    System.out.println(stack.pop()); // !!!

    stack.add("Test");
    System.out.println(stack.pop()); // Test

    String[] arr = {"123", "456", "789"};
    // loop -> insert data into stack
    stack.clear(); // List
    for (String str : arr) {
      stack.push(str);
    }
    System.out.println(stack.peek()); // 789
    // loop -> get the data from stack, place into another array
    String[] result = new String[arr.length];
    int idx = 0;
    while(!stack.isEmpty()) {
      result[idx++] = stack.pop();
    }
    System.out.println(Arrays.toString(result)); // [789, 456, 123]

    
  }
}
