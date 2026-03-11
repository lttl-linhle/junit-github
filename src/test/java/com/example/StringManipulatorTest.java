package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {

    private final StringManipulator manipulator = new StringManipulator();

    @Test
    void testReverse() {
        assertEquals("olleh", manipulator.reverse("hello"));
        assertNull(manipulator.reverse(null));
        assertEquals("", manipulator.reverse(""));
    }

    @Test
    void testCapitalize() {
        assertEquals("Hello", manipulator.capitalize("hello"));
        assertEquals("Hello", manipulator.capitalize("Hello"));
        assertEquals("", manipulator.capitalize(""));
        assertNull(manipulator.capitalize(null));
    }

    @Test
    void testIsPalindromeTrue() {
        assertTrue(manipulator.isPalindrome("racecar"));
        assertTrue(manipulator.isPalindrome("A man a plan a canal Panama"));
    }

    @Test
    void testIsPalindromeFalse() {
        assertFalse(manipulator.isPalindrome("hello"));
    }

    @Test
    void testIsPalindromeNull() {
        assertFalse(manipulator.isPalindrome(null));
    }
}
