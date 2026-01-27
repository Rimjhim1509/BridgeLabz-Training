package com.testingstringutils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    StringUtils utils = new StringUtils();

    // 🔹 reverse()
    @Test
    void testReverse() {
        assertEquals("avaJ", utils.reverse("Java"));
    }

    @Test
    void testReverseNull() {
        assertNull(utils.reverse(null));
    }

    // 🔹 isPalindrome()
    @Test
    void testPalindromeTrue() {
        assertTrue(utils.isPalindrome("madam"));
    }

    @Test
    void testPalindromeFalse() {
        assertFalse(utils.isPalindrome("java"));
    }

    @Test
    void testPalindromeNull() {
        assertFalse(utils.isPalindrome(null));
    }

    // 🔹 toUpperCase()
    @Test
    void testToUpperCase() {
        assertEquals("HELLO", utils.toUpperCase("hello"));
    }

    @Test
    void testToUpperCaseNull() {
        assertNull(utils.toUpperCase(null));
    }
}
