import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomHashMap {
  public static void main(String[] args) {
    Map<Integer, OrderItem> itemMap = new HashMap<>();
    itemMap.put(1, new OrderItem(3, 4.5));
    itemMap.put(2, new OrderItem(4, 5.5));
    itemMap.put(3, new OrderItem(5, 10.5));

    OrderItem orderItem = itemMap.get(3);
    System.out.println(orderItem.getUnitPrice()); // 10.5

    Map<Customer, List<Order>> cusMap = new HashMap<>();
    Customer c1 = new Customer("John");
    Customer c2 = new Customer("John");
    cusMap.put(c1, List.of(new Order(), new Order()));
    cusMap.put(c2, List.of(new Order(), new Order(), new Order()));
    System.out.println(cusMap.size()); // 1
    System.out.println(cusMap.get(c1).size()); // 3
    System.out.println(cusMap.get(c2).size()); // 3

  }
}
