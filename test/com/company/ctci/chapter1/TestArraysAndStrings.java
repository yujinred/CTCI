package com.company.ctci.chapter1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestArraysAndStrings {

    private static final ArraysAndStrings solution = new ArraysAndStrings();

    @Test
    void testIsAnagram() {
        assertFalse(solution.isAnagram("", "abc"));
        assertFalse(solution.isAnagram("abc", ""));
        assertTrue(solution.isAnagram("cba", "abc"));
        assertTrue(solution.isAnagram("admirer", "married"));
    }

    @Test
    void testRemoveDuplicates() {
        assertEquals("abcd", solution.removeDuplicates("aaabbccd"));
        assertEquals("zqsdcpo", solution.removeDuplicates("zqsdczpos"));
    }

    @Test
    void testReverseString() {
        assertEquals("goD", solution.reverseString("Dog"));
        assertEquals("", solution.reverseString(""));
        assertEquals("gnirts gnol a si siht wow", solution.reverseString("wow this is a long string"));
    }

    @Test
    void testUniqueChar() {
        assertTrue(solution.hasAllUniqueCharacters("asdfg"));
        assertFalse(solution.hasAllUniqueCharacters("asdfa"));
        assertTrue(solution.hasAllUniqueCharacters(""));
    }
}
