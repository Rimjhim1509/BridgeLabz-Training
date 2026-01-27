package com.parametrizedtest;

public class NumberUtilsTest {

    NumberUtils utils = new NumberUtils();

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 7, 9})
    void testIsEven(int number) {
        boolean result = utils.isEven(number);

        if (number % 2 == 0) {
            assertTrue(result);
        } else {
            assertFalse(result);
        }
    }
}
