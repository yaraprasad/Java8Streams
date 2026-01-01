package com.java.version.eight.streams.level.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountElementStartsWithA {
    public static void main(String[] args) {
    //Q. Count how many strings start with a specific letter (like 'A')
        List<String> fruits = Arrays.asList("Apple", "Banana", "Avocado", "Mango", "Apricot");

        long fruitsWithA = fruits.stream()
                .filter(str -> str.startsWith("A"))
                .count();
        System.out.println(fruitsWithA);

    }
}
