package com.bootcamp.javacode;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.times;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import com.bootcamp.javacode.model.Calculators;
import com.bootcamp.javacode.model.RealCalculator;

@ExtendWith(MockitoExtension.class)
public class CalculatorTest {

  @Mock
  private Calculators calculator; // new ?

  // @InjectMocks means calling the constructor "RealCalculator(Calculators calculator)"
  // by passing @Mock calculator
  @InjectMocks
  private RealCalculator realCalculator;

  @Test
  void testCalculateMethod() {
    // when someone call "calculator.addition(10, 5)", assume return 3 always.
    Mockito.when(calculator.addition(10, 5)).thenReturn(3);

    // Call the targeted test method
    RealCalculator realCalculator = new RealCalculator(calculator);

    // actually call calculator.addition(10, 5)
    assertThat(realCalculator.calculate(10), is(17)); // 3 + 10 + 4 = 17

    // Another case
    Mockito.when(calculator.addition(82, 41)).thenReturn(1000);

    assertThat(realCalculator.calculate(82), is(1086)); // 1000 + 82 + 4 = 1086

  }

  @Test
  void testSleep() {

    Mockito.when(calculator.addition(20, 10)).thenReturn(1000);

    RealCalculator realCalculator = new RealCalculator(calculator);

    assertThat(realCalculator.sleep(20), is(1020)); // 1000 + 20 = 1020

    // Verify How many times & what input parameters passed to call sleep method
    Mockito.verify(calculator, times(1)).addition(20, 10);
    Mockito.verify(calculator, times(0)).addition(20, 20);
  }

  @Test
  void testSleep2() {
    Mockito.when(calculator.addition(50, 25)).thenReturn(2);
    assertThat(this.realCalculator.sleep(50), is(22)); // 2 + 20
  }

}
