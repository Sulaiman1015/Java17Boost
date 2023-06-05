package com.array;

import java.util.Random;

public class RandomCode {
    public static void main(String[] args) {
        //5 digits random code, first 4 letters (a - z and A - Z) + 1 number
        //1: Create array for first 4 letters (a - z and A - Z)
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if(i <= 25) {
                chs[i] = (char) (97 + i);//from 97 is 'a' in ASCII
            } else {
                chs[i] = (char) (65 + i - 26);//from 97 is 'a' in ASCII
            }
            //System.out.print(chs[i]+" ");
        }

        // random 4 times in chs
        Random r = new Random();
        String code = "";
        for (int i = 0; i < 4; i++) {
            int rIndex = r.nextInt(chs.length);
            code = code+chs[rIndex];
        }
        int x = r.nextInt(10);
        code=code+x;
        System.out.println(code);
    }
}
