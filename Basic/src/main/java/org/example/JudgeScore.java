package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class JudgeScore {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.println("judge score "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        score(arr);

    }

    public static void score(int[] arr){
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
            if(arr[i] > max){
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        double score = (double) (sum - max - min) /4;
        System.out.println("the sum scores is "+sum);
        System.out.println("the max score is "+max);
        System.out.println("the mix score is "+min);
        System.out.println("the average score is "+score);
    }
}
