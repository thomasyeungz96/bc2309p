package com.bootcamp.javacode;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import com.bootcamp.javacode.model.Calculators;
import com.bootcamp.javacode.model.Person;
import com.bootcamp.javacode.model.Staff;

public class HamcrestTest {

  @Test
  void test() {
    assertThat(Calculators.add(3, 2), is(5));
    assertThat(Calculators.add(3, 2), is(not(6)));
    assertThat(Calculators.add(4, 7), is(greaterThan(10)));
    assertThat(Calculators.add(4, 7), is(not(greaterThan(11))));
  }

  @Test
  void testString() {
    assertThat(Person.concat("world"), is("helloworld"));
    assertThat(Person.concat("world"), is(not("hello")));
    assertThat(Person.concat("world"), not("hello"));
    assertThat(Person.concat("world"), not(equalTo("hello")));
    assertThat(Person.concat("world"), containsString("hello")); // similar to indexOf

    String str = null;
    assertThat(str, is(nullValue()));
  }

  @Test
  void testObject() {
    String s1 = "hello";
    String s2 = "hello";
    assertThat(s1, is(sameInstance(s2)));
  }

  @Test
  void testAll() {
    assertThat(Calculators.add(50, 5), allOf(greaterThan(54), lessThan(56),
        greaterThanOrEqualTo(55), lessThanOrEqualTo(55)));
  }

  @Test
  void testAny() {
    assertThat(Calculators.add(50, 5), anyOf(greaterThan(55), // fail
        lessThan(55), // fail
        greaterThanOrEqualTo(55), // pass
        lessThanOrEqualTo(54) // fail
    ));
  }

  @Test
  void testArrayList() {
    List<String> names = new ArrayList<>(List.of("John", "Peter", "Tommy"));
    assertThat(names, hasItem("John"));
    assertThat(names, hasItem("Tommy"));
    assertThat(names, not(hasItem("Jenny")));

    assertThat(names, hasItems("Tommy", "John"));

    assertThat(names, hasSize(3));
    assertThat(names, not(hasSize(4)));

    // contains() is checking ordering and items
    assertThat(names, contains("John", "Peter", "Tommy"));
    assertThat(names, not(contains("Peter", "John", "Tommy")));

    assertThat(names, containsInAnyOrder("Peter", "John", "Tommy"));

    List<String> emptyList = new ArrayList<>();
    assertThat(emptyList, empty());
  }

  @Test
  void testArray() {
    Integer[] arr = new Integer[] {2, 4, 7, 11, 8};
    assertThat(arr, arrayContainingInAnyOrder(7, 4, 11, 8, 2));
    assertThat(arr, arrayContaining(2, 4, 7, 11, 8));
    assertThat(arr, not(arrayContaining(4, 2, 7, 11, 8)));

    String[] strings = new String[] {"hello", "world"};
    assertThat(Arrays.asList(strings), hasItem("world"));
  }

  @Test
  void testTolerance() {
    double actual = 3.14159;
    double expected = 3.14;
    double delta = 0.01;
    assertThat(actual, closeTo(expected, delta));

    double actual2 = 3.135;
    assertThat(actual2, closeTo(expected, delta));

    double actual3 = 3.129;
    assertThat(actual3, not(closeTo(expected, delta)));
  }

  @Test
  void testObjectClass() {
    Object obj = new Staff("John", 23);
    assertThat(obj, instanceOf(Staff.class));
  }

  @Test
  void testUppercaseMatcher() {
    String s1 = "HELLO";
    String s2 = "HelloWorld";
    assertThat(s1, UpperCaseStringMatcher.containsUppercaseOnly());
    assertThat(s2, not(UpperCaseStringMatcher.containsUppercaseOnly()));
  }
}
