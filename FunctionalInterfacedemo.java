package com.p1.functionalinterface.pridifindfuninterface;

import java.util.function.*;

public class FunctionalInterfacedemo {

    public static void m1(Function<String, Integer> fn2, String[] str) {
// no need if condation bcz function apply on all element
        for (String s : str) {
            System.out.println(fn2.apply(s));
        }

    }

    public static void main(String[] args) {
        Function<String, String> fn = s -> s.concat("Engineer");

        String result = fn.apply("Pankaj ");
        System.out.println(result);

        String[] str = { "engineer", "pankaj", "singh", "delhi" };

        Function<String, Integer> fn2 = s -> s.length();
        m1(fn2, str);

    }
}
