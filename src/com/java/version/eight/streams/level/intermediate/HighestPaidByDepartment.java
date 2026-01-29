package com.java.version.eight.streams.level.intermediate;

import com.java.version.eight.streams.level.intermediate.dto.Employeee;

import java.util.*;
import java.util.stream.Collectors;

public class HighestPaidByDepartment {
    public static void main(String[] args) {
    //Q. Find the highest paid employee in each department
        List<Employeee> employeees = Arrays.asList(
                new Employeee(1, "John", "HR", 50000),
                new Employeee(2, "Jane", "IT", 70000),
                new Employeee(3, "Mike", "IT", 80000),
                new Employeee(4, "Sara", "Finance", 60000),
                new Employeee(5, "Paul", "HR", 55000)

        );

        Map<String, List<Employeee>> highSalaryDepartment1 = employeees.stream()
                .collect(Collectors.groupingBy(Employeee::getDepartment,
                        Collectors.toList()
                ));
        System.out.println(highSalaryDepartment1); //group by department
        //{Finance=[4: Sara: Finance: 60000], HR=[1: John: HR: 50000, 5: Paul: HR: 55000], IT=[2: Jane: IT: 70000, 3: Mike: IT: 80000]}

        //solution - highest salary in each department
        Map<String, Optional<Employeee>> highSalaryDepartment = employeees.stream()
                .collect(Collectors.groupingBy(Employeee::getDepartment,
                        Collectors.maxBy(Comparator.comparing(Employeee::getSalary))
                ));
        System.out.println(highSalaryDepartment);
        //{Finance=Optional[4: Sara: Finance: 60000], HR=Optional[5: Paul: HR: 55000], IT=Optional[3: Mike: IT: 80000]}

        //solution - lowest salary in each department
        Map<String, Optional<Employeee>> lowSalaryDepartment2 = employeees.stream()
                .collect(Collectors.groupingBy(Employeee::getDepartment,
                        Collectors.minBy(Comparator.comparing(Employeee::getSalary))
                ));
        System.out.println(lowSalaryDepartment2);
        //{Finance=Optional[4: Sara: Finance: 60000], HR=Optional[1: John: HR: 50000], IT=Optional[2: Jane: IT: 70000]}
    }
}
