package com.array;

import java.util.Arrays;

public class Encryption {
    //encrypt 4 digits number like : 1512
    public static void main(String[] args) {
        getEncrypt();
    }

    public static void getEncrypt(){
        //encrypt 4 digits integer code

        //1: get each code and put into array, but for initialize array need length
        int code = 1983;
        int number = code;
        //1.1 get length use count++
        int count = 0;
        while (code != 0){
            code = code/10;
            count++;
        }
        System.out.println("count: "+count);
        int[] arr = new int[count];
        while (number !=0){
            int x = number%10;//get each figure
            number = number/10;
            arr[count-1] = x;
            count--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.println("-------");
        //2: each number add 5
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 5;
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //3: each number %10
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]%10;
            System.out.print(arr[i]+" ");
        }
        //reverse position
        for (int i = 0, j = arr.length-1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //splice number
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = num*10+arr[i];
        }
        System.out.println();
        System.out.println(num);
    }

}
