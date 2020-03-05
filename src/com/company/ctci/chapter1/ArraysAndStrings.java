package com.company.ctci.chapter1;

import java.util.*;
import java.util.stream.Stream;

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

    String reverseString(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            result.append(input.charAt(i));
        }

        return result.toString();
    }

    String removeDuplicates(String input) {
        for (int i = 0; i < input.length(); ++i) {
            char token = input.charAt(i);
            for (int j = i+1; j < input.length(); ++j) {
                if (input.charAt(j) == token) {
                    input = input.substring(0, j) + input.substring(j+1);
                    j--;
                }
            }
        }
        return input;
    }

    boolean isAnagram(String original, String comparison) {
        Map<Character, Integer> hashTable = new HashMap<>();
        if (original == null || comparison == null) return false;
        for (Character token : original.toCharArray()) {
            if (!hashTable.containsKey(token)) {
                hashTable.put(token, 1);
            } else {
                hashTable.put(token, hashTable.get(token) + 1);
            }
        }

        for (Character cToken : comparison.toCharArray()) {
            if (!hashTable.containsKey(cToken)) return false;
            int newCount = hashTable.get(cToken) - 1;
            if (newCount < 0) return false;
            hashTable.put(cToken, newCount);
        }

        for (Character key : hashTable.keySet()) {
            if (hashTable.get(key) > 0) return false;
        }
        return true;
    }
}
