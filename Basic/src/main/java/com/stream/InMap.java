package com.stream;

import java.util.HashMap;

public class InMap {
    //test stream in map
    public static void main(String[] args) {
        HashMap<String,Integer> strMap = new HashMap<>();
        strMap.put("a",1);
        strMap.put("b",2);
        strMap.put("c",3);
        strMap.put("d",4);

        //method 1 with keySet() to get stream keys
        strMap.keySet().stream().forEach(System.out::println);
        //method 2 with Values() to get stream values
        strMap.values().stream().forEach(System.out::println);
        //method 3 with entrySet() to get stream keys and values
        strMap.entrySet().stream().forEach(System.out::println);
    }
}
