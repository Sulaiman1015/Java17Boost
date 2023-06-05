package com.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DoubleColorBall {
    public static void main(String[] args) {
        //generate prize number
        int[] prizeNumbers = createNumber();
        System.out.println(Arrays.toString(prizeNumbers));
        //get user input number
        int[] userNumbers = inputNum();
        System.out.println(Arrays.toString(userNumbers));
        //comparer
        int redCount = 0; // corrected number in red
        int blueCount = 0; // corrected number in blue
        //comparer in red ball
        for (int i = 0; i < userNumbers.length-1; i++) {
            for (int j = 0; j < prizeNumbers.length-1; j++) {
                if(userNumbers[i] == prizeNumbers[j]){
                    redCount++;
                    break;
                }
            }
        }
        if (userNumbers[userNumbers.length-1] == prizeNumbers[prizeNumbers.length-1]) {
            blueCount++;
        }
        System.out.println("corrected in red : "+redCount);
        System.out.println("corrected in blue : "+blueCount);
    }

    public static int[] inputNum(){
        //user enter number to prize
        int[] userNums = new int[7];
        Scanner sc = new Scanner(System.in);
        //input 6 red balls nums
        for (int i = 0; i < userNums.length-1; ) {
            System.out.println("input "+(i+1)+"th number between 1-33: ");
            int redNum = sc.nextInt();
            if(redNum >= 1 && redNum <= 33){
                if(!contains(userNums,redNum)){
                    userNums[i] = redNum;
                    i++;
                }else{
                    System.out.println("number exist");
                }
            }else {
                System.out.println("number not between 1-33");
            }
        }

        System.out.println("input "+(userNums.length)+"th number between 1-16: ");
        while (true){
            int blueNum =sc.nextInt();
            if(blueNum >= 1 && blueNum <= 16){
                userNums[userNums.length-1] = blueNum;
                break;
            }else {
                System.out.println("number not between 1-16");
            }
        }

        System.out.println(Arrays.toString(userNums));
        return userNums;
    }

    public static int[] createNumber(){
        //6 red balls with numbers in 1-33 and 1 blue ball with 1-16 for one bonus
        int[] balls = new int[7];
        Random r = new Random();
        //put 6 random number on 6 red balls
        for (int i = 0; i < balls.length-1;) {
            int redNum = r.nextInt(33)+1;
            if(!contains(balls,redNum)){
                balls[i] = redNum;
                i++;
            }
        }
        //put 1 random number on the blue ball
        int blueNum = r.nextInt(16)+1;
        balls[balls.length-1] = blueNum;
        return balls;
    }

    public static boolean contains(int[] balls, int number){
        for (int i = 0; i < balls.length; i++) {
            if(balls[i] == number){
                return true;
            }
        }
        return false;
    }
}
