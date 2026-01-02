package com.java.version.eight.streams.level.supereasy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareNumbers {
    public static void main(String[] args) {

        //Q. convert numbers in list to their squares
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = numbers.stream().map(n->n*n).collect(Collectors.toList());
        System.out.println(result); //[1, 4, 9, 16, 25]

        //power of 5 numbers
        int[] result1 = numbers.stream()
                .map(n -> Math.pow(n, 5))
                .mapToInt(Double::intValue)
                .toArray();
        System.out.println(Arrays.toString(result1)); //[1, 32, 243, 1024, 3125]

        //power of 10 numbers
        Arrays.stream(numbers.stream()
                .map(n -> Math.pow(n, 10))
                .mapToInt(Double::intValue).toArray()).forEach(System.out::println);

    }
}
