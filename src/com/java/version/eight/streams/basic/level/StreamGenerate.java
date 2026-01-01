package com.java.version.eight.streams.basic.level;

import java.util.Random;
import java.util.stream.Stream;

public class StreamGenerate {

    public static void main(String[] args) {

        Stream<Double> generateOut = Stream.generate(Math::random).limit(5);

        //Stream.generate(Math::random).forEach(System.out::println);
        // above line :: generated infinite-loop of double integers


        //Stream.generate(new Random()::nextDouble).limit(10).forEach(System.out::println);
        //Stream.generate(new Random()::nextInt).limit(10).forEach(System.out::println);
        //Stream.generate(new Random()::nextInt).filter(n-> n>0).limit(10).forEach(System.out::println);
        //Stream.generate(new Random()::nextInt).filter(n-> n>0 && n<11).limit(10).forEach(System.out::println);


        Random random = new Random();
        //kind of generating 4 digit OTP
        random.ints(10,0,9).limit(4).forEach(System.out::println);



    }
}
