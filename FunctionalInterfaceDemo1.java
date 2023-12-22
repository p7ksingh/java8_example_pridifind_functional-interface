package com.p1.functionalinterface.pridifindfuninterface;

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

public class FunctionalInterfaceDemo1 {
    public static void main(String[] args) {
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

        Predicate<Employee> pr = dt -> dt.getSalary() < 40000;

        Function<Employee, Employee> f = dt -> {
            dt.setSalary(dt.getSalary() + 7654);
            return dt;
        };
        List<Employee> list2 = new ArrayList<Employee>();
        for (Employee emp : employees) {
            if (pr.test(emp)) {
                f.apply(emp);
                list2.add(emp);
            }
        }
        System.out.println(list2);
    }
}