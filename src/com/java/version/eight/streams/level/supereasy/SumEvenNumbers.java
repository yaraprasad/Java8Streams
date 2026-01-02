package com.java.version.eight.streams.level.supereasy;

import java.util.Arrays;
import java.util.List;

public class SumEvenNumbers {
    public static void main(String[] args) {

    //Q. find sum of even numbers from the list

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //2,4,6,8,10
        Integer result = numbers.stream().filter(n -> n % 2 == 0)
                .reduce(0, (a, b) -> a + b);

        //Integer result2 = numbers.stream().filter(n -> n % 2 == 0)
        //.reduce(Integer::sum).get();
        System.out.println(result);
       // System.out.println(result2);

    //Q. find product of even numbers from the list

        Integer result1 = numbers.stream().filter(n -> n % 2 == 0)
                .reduce(1, (a, b) -> a * b);

        System.out.println(result1);

    }
}
