package com.java.version.eight.streams.level.hard;


import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SlidingWindowAverage {
    public static void main(String[] args) {
    //Q. given a list of integers, compute the average of every 3-element sliding window
        List<Integer> list = Arrays.asList(4, 8, 15, 16, 23, 42);
        // Given list  4,8,15,16,23,42
        // Avg sliding window 3.+
        //
        //
        //
        //
        //
        //
        //
        // ....9,13,18,27

        List<Double> avgList = IntStream.range(0, list.size() - 2)
                .mapToObj(i -> ((list.get(i) + list.get(i + 1) + list.get(i + 2)) / 3.0)
                ).toList();
        System.out.println(avgList); //[9.0, 13.0, 18.0, 27.0]

        //Generic
        int window = 3;
        List<Integer> avgList1 = IntStream.range(0, list.size() - (window-1))
                .mapToObj(i -> ((list.get(i) + list.get(i + 1) + list.get(i + 2)) / window)
                ).toList();
        System.out.println(avgList1); //[9, 13, 18, 27]

        int window1 = 4;
        List<Integer> avgList2 = IntStream.range(0, (int) (list.size() - (window1-1)))
                .mapToObj(i -> ((list.get(i) + list.get(i + 1) + list.get(i + 2)+list.get(i + 3)) / window1)
                ).toList();
        System.out.println(avgList2); //[10, 15, 24] for int window1
        //for double window1 [10.75, 15.5, 24.0]
        //still not generic for //(list.get(i) + list.get(i + 1) + list.get(i + 2)+list.get(i + 3))

        // Given list  4,8,15,16,23,42

        for(int j=2; j < list.size(); j++){
            int window2= j;
            List<List<Integer>> slidingSubList = IntStream.range(0, (int) (list.size() - (window2 - 1)))
                    .mapToObj(i -> list.subList(i, i + window2))
                    .toList();
            System.out.printf("subListSize = "+window2+" SubList :"+ slidingSubList);
            List<Double> slidingSubListAvg = IntStream.range(0, list.size() - (window2 - 1))
                    .mapToObj(i -> list.subList(i, i + window2))
                    .map(wind -> wind.stream()
                            .mapToInt(Integer::intValue)
                            .average()
                            .orElse(0.0))
                    .toList();
            System.out.print(" O/P : "+slidingSubListAvg);
            System.out.println();
        }
        //subListSize = 2 SubList :[[4, 8], [8, 15], [15, 16], [16, 23], [23, 42]] O/P : [6.0, 11.5, 15.5, 19.5, 32.5]
       // subListSize = 3 SubList :[[4, 8, 15], [8, 15, 16], [15, 16, 23], [16, 23, 42]] O/P : [9.0, 13.0, 18.0, 27.0]
       // subListSize = 4 SubList :[[4, 8, 15, 16], [8, 15, 16, 23], [15, 16, 23, 42]] O/P : [10.75, 15.5, 24.0]
       // subListSize = 5 SubList :[[4, 8, 15, 16, 23], [8, 15, 16, 23, 42]] O/P : [13.2, 20.8]


    }
}
