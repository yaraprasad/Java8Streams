package com.java.version.eight.streams.level.intermediate;

import com.java.version.eight.streams.level.intermediate.dto.Employeee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DepartmentEmployeeCount {
    public static void main(String[] args) {
    //Q. find all departments with more than 2 employees
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

        Map<String, Long> map = employeees.stream()
                .collect(Collectors.groupingBy(Employeee::getDepartment,
                        Collectors.counting()));
        System.out.println(map); //{Finance=2, HR=2, IT=3, Operations=1}

        List<String> list = map.entrySet().stream().filter(e -> e.getValue() > 2).map(Map.Entry::getKey)
                .toList();
        System.out.println(list); //[IT]

        //combine both in one
        List<String> list2 = employeees.stream()
                .collect(Collectors.groupingBy(Employeee::getDepartment,
                        Collectors.counting())).entrySet().stream().filter(e -> e.getValue() > 2).map(Map.Entry::getKey)
                .toList();
        System.out.println( list2); //[IT]


    }

}
