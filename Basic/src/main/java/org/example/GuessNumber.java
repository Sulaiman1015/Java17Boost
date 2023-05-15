package org.example;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        // generate a random number
        Random r = new Random();
        int num = r.nextInt(100)+1;//  (0 to 99)+1 --> 1 to 100

        // enter your guess number
        Scanner sc = new Scanner(System.in);
        for (int i=1; i<=3; i++){
            System.out.println("enter a number "+1+" : ");
            int guessNum = sc.nextInt();
            if(guessNum == num){
                System.out.println(num+", you win");
            }else {
                System.out.println("you lost");
            }
        }

    }
}
