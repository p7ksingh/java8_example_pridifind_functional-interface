package com.java8.ex.pridifindfunctionalinterfaceexample.funchaining;

import java.util.function.Function;

public class FunctionalChaining {
    public static void main(String[] args) {
        Function<String, String> f = dt -> dt.toUpperCase();
        Function<String, String> f1 = dt -> dt.substring(0, 8);
        System.out.println(f.apply("helloindia"));
        System.out.println(f1.apply("fromindia"));
        Function f2 = f.andThen(f1);// first apply f then f1
        System.out.println(f2.apply("Hi Pankaj How are you"));
        Function f3 = f.compose(f1);// first apply f 1then f
        System.out.println(f3.apply("OneTwoThree"));

        Function<Integer, Integer> i = dt -> dt * dt;
        Function<Integer, Integer> j = dt -> dt + dt;

        System.out.println(i.andThen(j).apply(10));
        System.out.println(i.compose(j).apply(10));

        Function<String, String> f7 = Function.identity(); //static method
        System.out.println(f7.apply("Pankaj"));
    }
}
