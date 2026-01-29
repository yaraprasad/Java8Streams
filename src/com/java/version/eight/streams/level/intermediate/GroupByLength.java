package com.java.version.eight.streams.level.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLength {
    public static void main(String[] args) {
    //Q. Group a list of words by their length using streams
        List<String> words = Arrays.asList("apple", "bat", "ball", "cat", "banana", "dog", "goat");

        Map<Integer, List<String>> group = words.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(group);
        //{3=[bat, cat, dog], 4=[ball, goat], 5=[apple], 6=[banana]}
    }
}
