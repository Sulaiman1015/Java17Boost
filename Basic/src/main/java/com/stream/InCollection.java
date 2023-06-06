package com.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class InCollection {
    public static void main(String[] args) {

        // test stream in collection

        ArrayList<String> list = new ArrayList<>();
        list.add("Jame");
        list.add("Jackson");
        list.add("John");
        list.add("Michael");
        list.stream().filter(name->name.startsWith("J")).filter(name->name.length() == 4).forEach(System.out::println);

        System.out.println("--------------------------");
        ArrayList<String> strList = new ArrayList<>();
        Collections.addAll(strList,"a","b","c","d");
        Stream<String> str = strList.stream();
        /**
        str.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        */
        str.forEach(System.out::println);//s -> System.out.println(s)
    }
}
