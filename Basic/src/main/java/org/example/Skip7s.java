package org.example;

public class Skip7s {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if(i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0){

                System.out.println("skip "+i);
                count++;
            }else{
                System.out.println(i);
            }
        }
        System.out.println("count is "+count);
    }
}
