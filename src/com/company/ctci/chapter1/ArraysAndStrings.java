package com.company.ctci.chapter1;

class ArraysAndStrings {
    boolean hasAllUniqueCharacters(String input) {
        for (int i = 0; i < input.length(); ++i) {
            char token = input.charAt(i);
            for (int j = i+1; j < input.length(); j++) {
                if (input.charAt(j) == token) return false;
            }
        }
        return true;
    }
}
