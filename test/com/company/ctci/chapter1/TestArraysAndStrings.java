package com.company.ctci.chapter1;

import com.company.ctci.TestUtil;

public class TestArraysAndStrings {


    private static void testUniqueChar() throws Exception {
        ArraysAndStrings solution = new ArraysAndStrings();
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
