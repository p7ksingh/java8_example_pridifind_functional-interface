package com.java8.ex.pridifindfunctionalinterfaceexample.funchaining;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

import lombok.Data;

@Data
class Employee {
    private int id;
    private String name;
    private int salary;
    private String address;

}

public class ConsumerDemo {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        List<Employee> employees = new ArrayList<Employee>();
        Employee employee1 = new Employee();
        employee1.setId(101);
        employee1.setName("pankaj");
        employee1.setSalary(10000);
        employee1.setAddress("delhi");

        Employee employee2 = new Employee();
        employee2.setId(101);
        employee2.setName("pankaj");
        employee2.setSalary(20000);
        employee2.setAddress("delhi");

        Employee employee3 = new Employee();
        employee3.setId(101);
        employee3.setName("pankaj");
        employee3.setSalary(30000);
        employee3.setAddress("delhi");
        Employee employee4 = new Employee();
        employee4.setId(101);
        employee4.setName("pankaj");
        employee4.setSalary(40000);
        employee4.setAddress("delhi");
        Employee employee5 = new Employee();
        employee5.setId(101);
        employee5.setName("pankaj");
        employee5.setSalary(50000);
        employee5.setAddress("delhi");
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee5);
        employees.add(employee4);
        employees.add(employee3);
        System.out.println(employees);
        Consumer<Employee> consumer = dt -> {
            System.out.println(dt.getName());
            System.out.println(dt.getId());
            System.out.println(dt.getSalary());
            System.out.println(dt.getAddress());
        };
        for (Employee employee : employees) {
            consumer.accept(employee);

        }
        System.out.println("=".repeat(100));

        Predicate<Employee> filterSalary = employees1 -> employees1.getSalary() < 20000;
        Function<Employee, Integer> funOnSalary = dt -> {
            int sal = dt.getSalary() + 5000;
            return sal;
        };
        Consumer<Employee> con = dt -> {

            System.out.println(dt.getId());
            System.out.println(dt.getName());
            System.out.println(funOnSalary.apply(dt)); //
            System.out.println(dt.getAddress());

        };
        // call
        for (Employee e : employees) {
            if (filterSalary.test(e)) {
                con.accept(e);
            }
        }

    }
}
