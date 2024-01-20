package enums;

public enum OrderStatus {
  ORDERED(1), PRODUCTION(2), SHIPPED(3), DELIVERED(4), CLOSE(5),;

  private int statusCode;

  private OrderStatus(int statusCode) {
    this.statusCode = statusCode;
  }

  public int getStatusCode() {
    return this.statusCode;
  }

  public OrderStatus getOrderStatus(int statusCode) {
    // values()
    for (OrderStatus status : OrderStatus.values()) {
      if (status.getStatusCode() == statusCode)
        return status;
    }
    return null; // throw
  }

  // manage status
  // 1. return next status
  public OrderStatus nextStatus() {
    int code = this.statusCode < 5 ? this.statusCode + 1 : this.statusCode;
    return getOrderStatus(code); // 4 -> return CLOSE(5)
  }

  // 2. check if the status is forwarded
  public boolean isForwardedStatus(OrderStatus orderStatus) {
    return this.statusCode < orderStatus.getStatusCode();
  }
  //

  public static void main(String[] args) {
    System.out.println(OrderStatus.CLOSE.nextStatus()); // return OrderStatus.CLOSE
    System.out
        .println(OrderStatus.ORDERED.isForwardedStatus(OrderStatus.SHIPPED)); // true
  }
}
