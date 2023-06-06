package com.stream;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Stream;

public class InArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Arrays.stream(arr).forEach(System.out::println);
        Stream.of(1,2,3,4,5).forEach(System.out::println);
        Stream.of(arr).forEach(System.out::println);

        String[] strs = {"a","b","c","d"};
        Arrays.stream(strs).forEach(System.out::println);
        Stream.of("a","b","c","d").forEach(System.out::println);
        Stream.of(strs).forEach(System.out::println);
    }
}
