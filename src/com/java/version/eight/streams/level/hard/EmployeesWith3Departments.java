package com.java.version.eight.streams.level.hard;

import com.java.version.eight.streams.level.hard.dto.WorkRecord;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeesWith3Departments {

    public static void main(String[] args) {
     //Q. Find all employes who worked in 3+ departments

        List<WorkRecord> records = Arrays.asList(
                new WorkRecord("John", "IT"),
                new WorkRecord("John", "Finance"),
                new WorkRecord("John", "HR"),
                new WorkRecord("Alice", "IT"),
                new WorkRecord("Alice", "HR"),
                new WorkRecord("Bob", "Finance"),
                new WorkRecord("David", "IT"),
                new WorkRecord("David", "Finance"),
                new WorkRecord("David", "HR"),
                new WorkRecord("David", "Admin")
        );

        Map<String, List<WorkRecord>> collect = records.stream()
                .collect(Collectors.groupingBy(
                        WorkRecord::getEmployeeName
                ));
        List<String> result = collect.entrySet().stream()
                .filter(e -> e.getValue().size() >= 3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(result); //[David, John]

    }
}
