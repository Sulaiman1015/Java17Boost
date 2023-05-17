package org.example;

public class PrimeNumber {
    //prime number between 101 - 200
    public static void main(String[] args) {
        int count = 0;
        for (int i = 101; i < 200; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if(i%j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(i+" is prime number");
                count++;
            }
        }
        System.out.println("there is "+count+" prime numbers");
    }
}
