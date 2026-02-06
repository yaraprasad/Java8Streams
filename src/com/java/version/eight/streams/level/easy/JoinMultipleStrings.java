package com.java.version.eight.streams.level.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinMultipleStrings {
    public static void main(String[] args) {
    //Q. Join all strings in a list into a single comman-separated strings
        List<String> fruits = Arrays.asList("Apple", "Banana", "Avocado", "Mango", "Apricot");

        String collect = fruits.stream()
                .collect(Collectors.joining());
        System.out.println(collect); //AppleBananaAvocadoMangoApricot

        String collect1 = fruits.stream()
                .collect(Collectors.joining(","));
        System.out.println(collect1);//Apple,Banana,Avocado,Mango,Apricot

        String collect2 = fruits.stream()
                .collect(Collectors.joining(",", "[", "]"));
        System.out.println(collect2); //[Apple,Banana,Avocado,Mango,Apricot]

    }
}
