package javafuncinterface;

import java.time.LocalDate;

public class Customer {
  private String name;
  private LocalDate joinDate;

  public Customer(String name, LocalDate joinDate) {
    this.name = name;
    this.joinDate = joinDate;
  }

  public String getName() {
    return this.name;
  }

  public LocalDate getJoinDate() {
    return this.joinDate;
  }

  @Override
  public String toString() {
    return "Customer(name=" + this.name //
        + " ,joinDate=" + this.joinDate //
        + ")";
  }
}
