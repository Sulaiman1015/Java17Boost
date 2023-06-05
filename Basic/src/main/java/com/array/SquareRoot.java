package com.array;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a integer: ");
        int num = sc.nextInt();
        for (int i = 1; i < num; i++) {
            if(i*i==num){
                System.out.println(i+" is square root of "+num);
                break;
            }else if(i*i>num){
                System.out.println((i-1)+" is integer part of square root for "+num);
                break;
            }
        }
    }
}
