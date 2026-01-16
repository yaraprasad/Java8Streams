package com.java.version.eight.streams.level.supereasy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMaxNumber {
    public static void main(String[] args) {

    //Q. find the maximum number in list
        List<Integer> numbers = Arrays.asList(3,7,20,5,11,12);


        Integer result = numbers.stream()
                .reduce(0, (a, b) -> Integer.max(a, b));
        System.out.println(result);

        // using method reference
        Integer result1 = numbers.stream()
                .reduce(0,Integer::max);
        System.out.println(result1);

        //max not need initial value so omit  identity 0 param
        Optional<Integer> result2 = numbers.stream()
                .reduce(Integer::max);
        System.out.println(result2.get());

    }
}
