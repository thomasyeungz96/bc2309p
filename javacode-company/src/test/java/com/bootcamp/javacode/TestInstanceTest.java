package com.bootcamp.javacode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// @TestInstance(TestInstance.Lifecycle.PER_METHOD) // by deafult
public class TestInstanceTest {

  private int x;

  private List<String> strings;

  @BeforeEach
  void init() {
    this.x = 20;
    strings = new ArrayList<>();
  }

  @AfterEach
  void afterallTest() {
    System.out.println("hello ... aftereach");
  }

  @Test
  void testMethod1() {
    this.x++;
    assertEquals(21, this.x);
  }

  @Test
  void testMethod2() {
    this.x++;
    assertEquals(21, this.x);
  }

  public static void main(String[] args) {
    TestInstanceTest t1 = new TestInstanceTest(); // 20
    t1.testMethod1();

    TestInstanceTest t2 = new TestInstanceTest(); // 20
    t2.testMethod2();
  }
}
