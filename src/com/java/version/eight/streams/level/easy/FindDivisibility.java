package com.java.version.eight.streams.level.easy;

import java.util.Arrays;
import java.util.List;

public class FindDivisibility {
    public static void main(String[] args) {
    //Q. check if any number is divisible by 3
        List<Integer> numbers = Arrays.asList(5, 7, 10, 15, 14, 9);

        boolean isDivisibleBy3 = numbers.stream().
                anyMatch(n -> n % 3 == 0); // Test DivisibleBy3
        System.out.println(isDivisibleBy3);  //true
    }
}
