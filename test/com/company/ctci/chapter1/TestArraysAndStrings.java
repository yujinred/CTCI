package com.company.ctci.chapter1;

import com.company.ctci.TestUtil;

public class TestArraysAndStrings {

    private static final ArraysAndStrings solution = new ArraysAndStrings();

    private static void testReverseString() throws Exception {
        TestUtil.assertEquals("Should reverse the string",
                solution.reverseString("Dog"),
                "goD");
        TestUtil.assertEquals("Empty String",
                solution.reverseString(""),
                "");
        TestUtil.assertEquals("Reverse this string",
                solution.reverseString("wow this is a long string"),
                "gnirts gnol a si siht wow");
    }

    private static void testUniqueChar() throws Exception {
        TestUtil.assertEquals("All letters should be unique",
                solution.hasAllUniqueCharacters("asdfg"),
                true
                );
        TestUtil.assertEquals("Duplicate letter should be detected",
                solution.hasAllUniqueCharacters("asdfa"),
                false
        );
        TestUtil.assertEquals("Empty String",
                solution.hasAllUniqueCharacters(""),
                true
        );
    }

    public static void main(String[] args) {
        try {
            testUniqueChar();
            testReverseString();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
