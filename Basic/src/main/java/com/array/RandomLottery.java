package com.array;

import java.util.Arrays;
import java.util.Random;

public class RandomLottery {
    public static void main(String[] args) {
        int[] arr = {2,588,888,1000,10000};
        int[] lotto = new int[arr.length];
        Random r = new Random();
        for (int i = 0; i < arr.length;) {
            int index = r.nextInt(arr.length);
            int prize = arr[index];
            if(!contains(lotto,prize)){
                lotto[i] = prize;
                i++;
            }

        }
        System.out.println(Arrays.toString(lotto));
    }

    public static boolean contains(int[] arr, int prize){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == prize){
                return true;
            }
        }
        return false;
    }

}
