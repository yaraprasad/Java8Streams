package com.java.version.eight.streams.level.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenListofList {
    public static void main(String[] args) {
    //Q. Flatten the list of list
                List<List<Integer>> listOfList = Arrays.asList(
                        Arrays.asList(1, 2, 3),
                        Arrays.asList(4, 5),
                        Arrays.asList(6, 7, 8, 9)
                );
                System.out.println(listOfList); //[[1, 2, 3], [4, 5], [6, 7, 8, 9]]

                List<Integer> flatList = listOfList.stream()
                        .flatMap(List::stream)
                        .collect(Collectors.toList());
                System.out.println(flatList); //[1, 2, 3, 4, 5, 6, 7, 8, 9]

    }
}
