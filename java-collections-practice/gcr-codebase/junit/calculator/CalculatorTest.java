package com.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void testAdd() {
        Assertions.assertEquals(10, 5 + 5);
    }
}
