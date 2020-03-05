package com.company.ctci.chapter1;

import com.company.ctci.TestUtil;

public class TestArraysAndStrings {

    private static final ArraysAndStrings solution = new ArraysAndStrings();

    private static void testIsAnagram() throws Exception {
        TestUtil.assertEquals("Left is empty",
                solution.isAnagram("", "abc"),
                false);

        TestUtil.assertEquals("Right is empty",
                solution.isAnagram("abc", ""),
                false);

        TestUtil.assertEquals("Actual test this time",
                solution.isAnagram("cba", "abc"),
                true);

        TestUtil.assertEquals("Cool anagram",
                solution.isAnagram("admirer", "married"),
                true);
    }

    private static void testRemoveDuplicates() throws Exception {
        TestUtil.assertEquals("it works!",
                solution.removeDuplicates("aaabbccd"),
                "abcd");

        TestUtil.assertEquals("it works for strings unordered!",
                solution.removeDuplicates("zqsdczpos"),
                "zqsdcpo");
    }

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
            testRemoveDuplicates();
            testIsAnagram();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
