package com.java.version.eight.streams.level.intermediate;

import com.java.version.eight.streams.level.intermediate.dto.Person;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AveragePersonAgeExample {

    public static void main(String[] args) {

    //Q. Calculate the average age of a list of person objects using java streams
        List<Person> peoples = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 28),
                new Person("David", 35)
        );

        double peopleAgeAvg = peoples.stream().mapToInt(Person::getAge)
                .average().orElse(0.0);
        System.out.println(peopleAgeAvg);
    }
}
