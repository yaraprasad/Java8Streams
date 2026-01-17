package com.java.version.eight.streams.level.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
    //Q. find first non repeating character in string
        String input = "swiss";
        Optional<Map.Entry<Character, Long>> frequentChars = input.chars()
                .mapToObj(c -> (char) c)   //'s','w','i','s','s'
                .collect(Collectors.groupingBy(Function.identity(), ////{s=3, w1, i=1}
                        LinkedHashMap::new, Collectors.counting())) //preserve the insertion order
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .findFirst();

        System.out.println(frequentChars);
    }
}
