package com.java.version.eight.streams.level.easy;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class FindAverage {

    public static void main(String[] args) {
    //Q. Find the average of all numbers in a list.
        //mathematical (aggregators) operations - min,max, sum and average works on primitive data types
        List<Integer> numbers = Arrays.asList(3, 6, 9, 12, 15, 18);

        OptionalDouble avg = numbers.stream()
                .mapToInt(Integer::intValue)
                .average();

        System.out.println(avg.getAsDouble());

        double avg1 = numbers.stream()
                .mapToInt(Integer::intValue)
                .average().orElse(0.0);
        System.out.println(avg1);
    }
}
