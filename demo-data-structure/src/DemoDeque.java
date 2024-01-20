import java.util.Deque;
import java.util.LinkedList;

public class DemoDeque {
  public static void main(String[] args) {
    // Ineterface (Deque)
    Deque<Customer> customers = new LinkedList<>();
    // Hide the methods of List, it only contains Deque methods
    customers.add(new Customer("John")); // same as addLast()
    customers.addFirst(new Customer("Steven"));
    customers.addLast(new Customer("Mary"));
    customers.add(new Customer("Tommy")); // same as addLast()
    System.out.println(customers); //[Customer(name=Steven, orders=[]), Customer(name=John, orders=[]), Customer(name=Mary, orders=[]), Customer(name=Tommy, orders=[])]
    customers.remove(); // Steven
    customers.removeFirst(); // John
    customers.removeLast(); // Tommy
    System.out.println(customers); // Mary
    
    customers.push(new Customer("Jenny")); // same as addFirst()
    System.out.println(customers); // [Customer(name=Jenny, orders=[]), Customer(name=Mary, orders=[])]
    customers.pop(); // same as removeFirst()
    
    System.out.println(customers); // [Customer(name=Mary, orders=[])]

    // customers.pollFirst();
    // customers.pollLast();
    customers.peek();

  }
}
