package org.example;

import java.util.Scanner;

public class ArrayMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrs = new int[5];
        int max = arrs[0];
        //i from 1 for avoid comparing arrs[0] with max;
        for (int i = 1; i < arrs.length; i++) {
            System.out.println("enter "+(i+1)+"th number: ");
            arrs[i] = sc.nextInt();

            if( arrs[i] > max){
                max = arrs[i];
            }
        }
        System.out.println("max = "+max);
    }
}
