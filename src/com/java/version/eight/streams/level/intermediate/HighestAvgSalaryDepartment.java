package com.java.version.eight.streams.level.intermediate;

import com.java.version.eight.streams.level.intermediate.dto.Employeee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HighestAvgSalaryDepartment {

    public static void main(String[] args) {
    //Q. find department with the highest average salary
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

        Map<String, Double> deptAvgSalary = employeees.stream()
                .collect(Collectors.groupingBy(Employeee::getDepartment,
                        Collectors.averagingDouble(Employeee::getSalary)));
        System.out.println(deptAvgSalary);
        //{Finance=64500.0, HR=62500.0, IT=71666.66666666667, Operations=44000.0}

        Map.Entry<String, Double> highAvgSalDept = deptAvgSalary.entrySet().stream().max(Map.Entry.comparingByValue())
                        .get();

        System.out.println(highAvgSalDept); //IT=71666.66666666667

        // merge two streams
        Map.Entry<String, Double> maxAvgDeptSal = employeees.stream()
                .collect(Collectors.groupingBy(Employeee::getDepartment,
                        Collectors.averagingDouble(Employeee::getSalary)))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get();
               // .orElseThrow();
        System.out.println(maxAvgDeptSal); //IT=71666.66666666667
    }
}
