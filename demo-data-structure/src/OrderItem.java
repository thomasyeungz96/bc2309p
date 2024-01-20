import java.math.BigDecimal;

public class OrderItem {

  private int quantity;

  private double unitPrice;

  public OrderItem(int quantity, double unitPrice) {
    this.quantity = quantity;
    this.unitPrice = unitPrice;
  }

  public int getQuantity() {
    return this.quantity;
  }

  public double getUnitPrice() {
    return this.unitPrice;
  }

  public BigDecimal total() {
    return BigDecimal.valueOf(quantity) //
        .multiply(BigDecimal.valueOf(unitPrice));
  }

  public static void main(String[] args) {
    OrderItem item1 = new OrderItem(3, 3.3);
    OrderItem item2 = new OrderItem(4, 0.3);
    System.out.println(item1.total()); // 9.9
    System.out.println(item2.total()); // 1.2
  }

}
