package com.java.version.eight.streams.level.easy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstNonEmptyString {
    public static void main(String[] args) {
    //Q. find the first non-empty string in a list
        List<String> strings = Arrays.asList("", "", "Hello", "World", "");

        List<String> list = strings.stream()
                .filter(s -> !s.isEmpty())
                .toList();
        System.out.println(list); //[Hello, World]

        Optional<String> firstNonemptyString = strings.stream()
                .filter(s -> !s.isEmpty())
                .findFirst();
        System.out.println(firstNonemptyString.get()); //Hello
    }
}
