package com.array;

import java.util.Random;

public class ArraySum {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arrs = new int[10];
        int sum = 0;
        for (int i = 0; i < arrs.length; i++) {
            arrs[i] = r.nextInt(100)+1;
            sum += arrs[i];
        }
        double avg = (double) sum /arrs.length;
        System.out.println("sum = "+sum);
        System.out.println("avg = "+avg);
    }
}
