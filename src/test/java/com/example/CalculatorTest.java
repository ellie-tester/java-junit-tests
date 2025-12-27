package com.example;

import example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    
    public void twoPlusTwoShouldReturnFour() {
        int num1 = 2, num2 = 2;
        int sumResult = calculator.subtract(num1, num2);
        Assertions.assertEquals(4, sumResult, "Method is not working!");

    }

    @Test
    public void twoPlusFourShouldReturnSix() {
        int num1 = 2, num2 = 4;
        int sumResult = calculator.subtract(num1, num2);
        Assertions.assertEquals(6, sumResult, "Method is not working!");
    }
}
