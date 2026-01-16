package com.java.version.eight.streams.level.supereasy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindFirstNumberGreaterthan10 {
    public static void main(String[] args) {

    //Q. find the first number greather than 10 from the list
        List<Integer> numbers = Arrays.asList(3,7,12,5,11,20);
        List<Integer> result = numbers.stream().filter(n -> n>10)
                .collect(Collectors.toList());
        System.out.println(result); // 12,11,20

        Optional<Integer> result1 = numbers.stream().filter(n -> n > 10)
                .findFirst();
        System.out.println(result1.get()); //12...wrong ..answer must be 11 right

        //Correct way is
        Optional<Integer> result2 = numbers.stream().filter(n -> n > 10)
                .sorted()
                .findFirst();
        System.out.println(result2.get()); //11




    }
}
