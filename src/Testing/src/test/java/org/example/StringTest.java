package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;

public class StringTest {

    @Test
    public void testConcatenateSuccess() {
        StringProcessor processor = new StringProcessor("ant", "man");
        String result = processor.concatenate("ant", "man");
        assertEquals("antman", result);
    }

    @Test
    public void testConcatenateWithNull() {
        StringProcessor processor = new StringProcessor("ant", "man");

        assertThrows(IllegalArgumentException.class, () -> {
            processor.concatenate(null, "man");
        });
    }

    @Test
    public void testIsPalindromeTrue() {
        StringProcessor processor = new StringProcessor("", "");
        assertTrue(processor.isPalindrome("madam"));
    }

    @Test
    public void testIsPalindromeFalse() {
        StringProcessor processor = new StringProcessor("", "");
        assertFalse(processor.isPalindrome("hello"));
    }

    @Test
    public void testIsPalindromeWithNull() {
        StringProcessor processor = new StringProcessor("", "");
        assertFalse(processor.isPalindrome(null));
    }
}