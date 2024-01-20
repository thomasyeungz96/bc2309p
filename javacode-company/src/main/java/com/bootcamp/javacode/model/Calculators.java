package com.bootcamp.javacode.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Calculators {

  public static int add(int x, int y) { // UNIT
    // We need to define the method signature before defining the test cases
    return x + y;
  }

  public int addition(int x, int y) { // UNIT
    return x + y;
  }

  // ascending order
  public static List<Integer> sort(int[] arr) {
    // arr -> list
    List<Integer> result =
        Arrays.stream(arr).boxed().collect(Collectors.toList());
    // list -> sort?
    Collections.sort(result);
    return result;
  }

}
