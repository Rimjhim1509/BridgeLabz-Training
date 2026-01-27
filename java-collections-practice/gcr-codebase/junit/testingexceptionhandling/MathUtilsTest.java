package com.testingexceptionhandling;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    MathUtils mathUtils = new MathUtils();

    @Test
    void testDivideByZero() {
        ArithmeticException exception = assertThrows(
                ArithmeticException.class,
                () -> mathUtils.divide(10, 0)
        );

        assertEquals("Division by zero not allowed", exception.getMessage());
    }
}
