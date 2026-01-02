package com.java.version.eight.streams.level.supereasy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOrProductOfNumbers {
    public static void main(String[] args) {

    //Q. Find sum/product of all numbers in list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        // sum 15 ,Product 120
        //For sum
        Integer result = numbers.stream().reduce(0, (x, y) -> x + y);
        System.out.println(result);
        //For Product
        Integer result1 = numbers.stream().reduce(1, (x, y) -> x * y);
        System.out.println(result1);
    }
}
