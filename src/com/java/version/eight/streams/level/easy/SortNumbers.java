package com.java.version.eight.streams.level.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbers {
    public static void main(String[] args) {
    //Q. sort a list of integers in ascending and descending order using streams
        List<Integer> numbers = Arrays.asList(5, 5, 1, 5, 1, 8, 3, 2, 10);

        List<Integer> ascendingNums = numbers.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(ascendingNums);

        List<Integer> descendingNums = numbers.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(descendingNums);


    }
}
