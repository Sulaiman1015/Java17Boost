package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /**
        //number palindrome
        System.out.println("enter a number: ");
        int num = sc.nextInt();
        int reversedNum = 0;
        int originalNum = num;
        while ( num != 0 ) {
            int n = num%10;
            System.out.println("n="+n);
            reversedNum = reversedNum*10+n;
            num = num/10;
            System.out.println("reversedNum="+reversedNum);
        }
        if(originalNum == reversedNum){
            System.out.println("entered number palindrome");
        } else {
            System.out.println("entered number not palindrome");
        }
        */

        //string palindrome
        System.out.println("enter a word: ");
        String word = sc.nextLine();
        StringBuilder reversedWord = new StringBuilder();
        //String originalWord = word;
        System.out.println(word.length());
        for (int i = word.length()-1; i >=0 ; i--) {
            char c = word.charAt(i);
            reversedWord.append(c);// reversedWord += c
        }
        if(word.contentEquals(reversedWord)) {
            System.out.println(reversedWord + " = " + word+", so it's a palindrome");
        }else {
            System.out.println(reversedWord + " != " + word+", so it's not palindrome");
        }

    }
}