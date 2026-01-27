package com.java.version.eight.streams.level.intermediate;

import com.java.version.eight.streams.level.intermediate.dto.Employeee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDepartment {
    public static void main(String[] args) {
    //Q. Group employees by department and calculated average salary.
        List<Employeee> employees = Arrays.asList(
                new Employeee(1, "John", "HR", 50000),
                new Employeee(2, "Jane", "IT", 70000),
                new Employeee(3, "Mike", "IT", 80000),
                new Employeee(4, "Sara", "Finance", 60000),
                new Employeee(5, "Paul", "HR", 55000)

        );

        Map<String, Double> output = employees.stream()
                .collect(Collectors.groupingBy(Employeee::getDepartment
                        , Collectors.averagingDouble(Employeee::getSalary))
                );
        System.out.println(output);
        //{Finance=60000.0, HR=52500.0, IT=75000.0}
    }
}
