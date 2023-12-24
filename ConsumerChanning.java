package com.java8.ex.pridifindfunctionalinterfaceexample.funchaining;

import java.util.function.Consumer;

import lombok.Data;

@Data
class Employee {
    int id;
    String name;
}

public class ConsumerChanning {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setId(101);
        emp.setName("John");

        Consumer<Employee> c1 = dt -> {
            System.out.println(dt.getId());
            System.out.println(dt.getName());
        };
        Consumer<Employee> c2 = dt -> {
            System.out.println(dt.getId());
            System.out.println(dt.getName());
        };
        Consumer<Employee> c3 = dt -> {
            System.out.println(dt.getId());
            System.out.println(dt.getName());
        };
        Consumer<Employee> c4 = dt -> {
            System.out.println(dt.getId());
            System.out.println(dt.getName());
        };
        Consumer<Employee> c5 = dt -> {
            System.out.println(dt.getId());
            System.out.println(dt.getName());
        };
        c1.andThen(c2).andThen(c3).andThen(c4).andThen(c5).accept(emp);
    }
}
