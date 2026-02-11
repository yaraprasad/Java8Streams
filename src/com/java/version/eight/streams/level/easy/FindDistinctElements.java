package com.java.version.eight.streams.level.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDistinctElements {
    public static void main(String[] args) {
    //Q. Find all distinct elements from a list (remove duplicates)
        List<Integer> numbers = Arrays.asList(5, 2, 8, 2, 3, 5, 9, 3);
        //5,2,8,3,9

        Set<Integer> set = numbers.stream().collect(Collectors.toSet());
        System.out.println(set); // arbitrary vales
        
        //alternate way
        Set<Integer> set1 = new HashSet<>(numbers);
        System.out.println(set1); //arbitrary vales

        List<Integer> list = numbers.stream().distinct().collect(Collectors.toList());;
        System.out.println(list); //preserved insertion order

    }
}
