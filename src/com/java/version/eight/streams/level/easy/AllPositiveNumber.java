package com.java.version.eight.streams.level.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AllPositiveNumber {
    public static void main(String[] args) {
    //Q. check if all elements are positive numbers
        List<Integer> numbers = Arrays.asList(3, 6, 9, 12, 15, 18);

        List<Integer> postiveList = numbers.stream().filter(n -> n > 0)
                .collect(Collectors.toList());

        System.out.println(postiveList);

        //better approach
        boolean isAllPositive = numbers.stream()
                .allMatch(n -> n > 0);
        System.out.println(isAllPositive); //true

        List<Integer> numbers1 = Arrays.asList(3, -6, 9, 12, 15, 18);
        List<Integer> postiveList1 = numbers1.stream().filter(n -> n > 0)
                .collect(Collectors.toList());

        System.out.println(postiveList1); //[3, 9, 12, 15, 18] list

        //better approach
        boolean isAllPositive1 = numbers1.stream()
                .allMatch(n -> n > 0);
        System.out.println(isAllPositive1); //false


    }
}
