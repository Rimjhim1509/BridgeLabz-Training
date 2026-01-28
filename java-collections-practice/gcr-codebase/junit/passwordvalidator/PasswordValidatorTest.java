package com.passwordvalidator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {

    @Test
    void testValidPassword() {
        assertTrue(PasswordValidator.isValid("Password1"));
    }

    @Test
    void testPasswordTooShort() {
        assertFalse(PasswordValidator.isValid("Pass1"));
    }

    @Test
    void testNoUppercase() {
        assertFalse(PasswordValidator.isValid("password1"));
    }

    @Test
    void testNoDigit() {
        assertFalse(PasswordValidator.isValid("Password"));
    }

    @Test
    void testNullPassword() {
        assertFalse(PasswordValidator.isValid(null));
    }
}
