import java.math.BigDecimal;
import java.util.ArrayList;

public class Order {

  private int orderNo;

  public static int counter = 0;

  private ArrayList<OrderItem> orderItems;

  public  ArrayList<OrderItem> getOrderItems() {
    return this.orderItems;
  }

  public Order() {
    this.orderNo = ++counter;
    this.orderItems = new ArrayList<>();
  }

  public boolean add(OrderItem orderItem) {
    return this.orderItems.add(orderItem);
  }

  public BigDecimal total() {
    BigDecimal total = BigDecimal.valueOf(0);
    for (OrderItem item : this.orderItems) {
      total = total.add(item.total());
    }
    return total;
  }

}
