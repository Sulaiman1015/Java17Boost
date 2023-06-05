package com.array;

public class CheckNum {
    public static void main(String[] args) {
        int[] arr = {22,19,90,23,56,47,60};
        System.out.println(contains(arr, 60));

    }
    public static boolean contains(int[] arrs, int num){
        for (int i = 0; i < arrs.length; i++) {
            if(arrs[i] == num)
                return true;
        }
        return false;
    }
}
