package com.java.version.eight.streams.level.supereasy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfEvenSquareNums {
    public static void main(String[] args) {

    //Q. sum of squares of even numbers in list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Integer evenSquareSum = numbers.stream().filter(n -> n % 2 == 0) //2,4,6,8,10
                .map(n -> n * n) //4,16,36,64,100
                .reduce(0, (a, b) -> a+b);
        System.out.println(evenSquareSum);

        //using integer sum method
        Integer evenSquareSum1 = numbers.stream().filter(n -> n % 2 == 0) //2,4,6,8,10
                .map(n -> n * n) //4,16,36,64,100
                .reduce(0, (a, b) -> Integer.sum(a, b));

        System.out.println(evenSquareSum1);

        Integer evenSquareSum2 = numbers.stream().filter(n -> n % 2 == 0) //2,4,6,8,10
                .map(n -> n * n) //4,16,36,64,100
                .reduce(0,Integer::sum);

        System.out.println(evenSquareSum2);
        //final version optimum one
        Optional<Integer> evenSquareSum3 = numbers.stream().filter(n -> n % 2 == 0) //2,4,6,8,10
                .map(n -> n * n) //4,16,36,64,100
                .reduce(Integer::sum);

        System.out.println(evenSquareSum3.get());

        int evenSquareSum4 = numbers.stream().filter(n -> n % 2 == 0) //2,4,6,8,10
                .mapToInt(n -> n * n) //4,16,36,64,100
                .sum();

        System.out.println(evenSquareSum4);

    }
}
