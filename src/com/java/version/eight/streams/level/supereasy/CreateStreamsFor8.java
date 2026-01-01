package com.java.version.eight.streams.level.supereasy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamsFor8 {

    public static void main(String[] args) {


      // Q: How do you create streams in java?

        List<String> names = Arrays.asList("alice","bob");

        //1. List -> Stream
        Stream<String> stream = names.stream();

        String[] arr = {"Java","Python","C++"};
        //2. Array -> Stream
        Stream<String> stream1 = Arrays.stream(arr);
        
        //3. Stream of 
        Stream<Integer> integers = Stream.of(1, 2, 3, 4, 5);
        
        //4 Stream generate
        Stream<Double> limit = Stream.generate(Math::random).limit(5);
        System.out.println(limit);


    }

}
