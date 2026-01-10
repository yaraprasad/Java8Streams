package com.java.version.eight.streams.level.intermediate.dto;

public class Employeee {
    private int id;
    private String name;
    private String department;
    private int salary;

    public Employeee(int id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return id + ": " + name + ": "+ department +": " + salary;
    }
}
