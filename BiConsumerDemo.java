package com.java8.ex.pridifindfunctionalinterfaceexample.funchaining;

import java.util.function.BiConsumer;

class Employee {
    int id;
    String name;
    double salary;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

}

public class BiConsumerDemo {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("pankaj");
        employee.setId(101);
        employee.setSalary(1000.00);
        BiConsumer<String, String> bcon = (e, e1) -> {
            System.out.println(e + e1);
        };
        bcon.accept("pankaj ", "singh");
        BiConsumer<Employee, Double> bcon1 = (e, increment) -> {
            System.out.println(e.getSalary() + increment);
        };
        bcon1.accept(employee, 500.0);

    }
}