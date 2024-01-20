package com.bootcamp.javacode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(OrderAnnotation.class)
public class InstancePerClassTest {

  private int x;

  @BeforeAll
  void init() {
    this.x = 10;
  }

  @AfterAll
  void afterallTest() {
    System.out.println("hello ... afterall");
  }

  @Test
  @Order(2)
  void testA() {
    this.x++;
    assertEquals(12, this.x);
  }

  @Test
  @Order(1)
  void testB() {
    this.x++;
    assertEquals(11, this.x);
  }

  public static void main(String[] args) {
    InstancePerClassTest instancePerClassTest = new InstancePerClassTest();
    instancePerClassTest.testA(); // x become 1
    instancePerClassTest.testB(); // x become 2
  }

}
