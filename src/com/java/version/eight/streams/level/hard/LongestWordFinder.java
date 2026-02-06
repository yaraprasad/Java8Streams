package com.java.version.eight.streams.level.hard;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class LongestWordFinder {
    public static void main(String[] args) {
    //Q. find the longest word in a sentence Ignoring Case and punctuation
        String sentence = "The quick, brown fox jumped over the lazy dog!";

        String words = Arrays.stream(
                        sentence.toLowerCase()
                                .replaceAll("[^a-z\\s]", "")
                                .split(" ")
                ).max(Comparator.comparing(String::length))
                .orElse("");
        System.out.println(words); //jumped


    }
}
