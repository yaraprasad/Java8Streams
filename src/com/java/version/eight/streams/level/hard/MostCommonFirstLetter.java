package com.java.version.eight.streams.level.hard;

import com.java.version.eight.streams.level.intermediate.dto.Employeee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostCommonFirstLetter {
    public static void main(String[] args) {
    //Q. Find the most common first letter among all employee names
        List<Employeee> employeees = Arrays.asList(
                new Employeee(1, "John", "IT", 60000),
                new Employeee(2, "Alice", "HR", 55000),
                new Employeee(3, "Bob", "IT", 75000),
                new Employeee(4, "Carol", "HR", 70000),
                new Employeee(5, "David", "Finance", 65000),
                new Employeee(6, "Eve", "IT", 80000),
                new Employeee(7, "Frank", "Finance", 64000),
                new Employeee(8, "Ala", "Operations", 44000)
        );
        //2 employees starting with a

        Map<Character, Long> map = employeees.stream()
                .map(e -> e.getName().charAt(0))
                .collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()
                ));
        System.out.println(map);
        //{A=2, B=1, C=1, D=1, E=1, F=1, J=1}

        Optional<Map.Entry<Character, Long>> max = map.entrySet().stream()
                .max(Map.Entry.comparingByValue());
        System.out.println(max); //Optional[A=2]

        // merge 2 streams
        Optional<Map.Entry<Character, Long>> maxLetter = employeees.stream()
                .map(e -> e.getName().charAt(0))
                .collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()
                )).entrySet().stream()
                .max(Map.Entry.comparingByValue());
        System.out.println(maxLetter.get().getKey()); //A
    }
    
}
