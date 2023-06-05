package com.string;

import java.awt.*;
import java.util.Scanner;

public class HideNumber {
    public static void main(String[] args) {
        // 0622220606 --> O6****0606
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your phone number: ");
        String num = sc.next();
        System.out.println(hideNum(num));

    }

    public static String hideNum(String number){
        String start = number.substring(0,2);
        String end = number.substring(6);
        String res = start+"****"+end;
        return res;
    }

}
