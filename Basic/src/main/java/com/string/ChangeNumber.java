package com.string;

import java.util.Scanner;

public class ChangeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        String resault ="";
        while (true){
            System.out.println("enter a number: ");
            num = sc.nextInt();
            if(num >=0 && num <=9999){
                break;
            }else{
                System.out.println("enter a number: ");
            }
        }
        while (true){
            int n = num%10;
            String strNum = getChange(n);
            resault = strNum + resault;
            System.out.println(resault);
            num = num/10;
            if(num == 0)
                break;
        }

    }

    public static String getChange(int number){
        String[] str = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        return str[number];
    }
}
