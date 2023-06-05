package com.array;

import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {
        int[][] gradeTable =
                {
                        {100, 100, 100, 100, 100},
                        {100, 100, 100, 100, 100},
                        {100, 100, 100, 100, 100},
                        {100, 100, 100, 100, 100},
                        {100, 100, 100, 100, 100},
                        {100, 100, 100, 100, 100},
                        {100, 100, 100, 100, 100}
                };

        int sum = 0;

        for (int i = 0; i < gradeTable.length; i++) {
            for (int j = 0; j < gradeTable[i].length; j++) {
                //System.out.print(gradeTable[i][j]+" ");
                sum += gradeTable[i][j];
            }
            //System.out.println();
        }
        System.out.println(sum);


        //System.out.println(Arrays.deepToString(gradeTable));
        //System.out.println("grade 2,4: " + gradeTable[2][4]);

    }
}
