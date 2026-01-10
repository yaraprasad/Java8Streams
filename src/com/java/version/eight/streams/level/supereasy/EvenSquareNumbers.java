package com.java.version.eight.streams.level.supereasy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenSquareNumbers {
    public static void main(String[] args) {
    //Q. square even numbers from list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result = numbers.stream().filter(n -> n % 2 == 0)
                                                .map(n -> n * n)
                                                .collect(Collectors.toList());
        System.out.println(result);
    }
}
