package org.example;

import java.util.Arrays;

public class CopyOfRange {
    public static void main(String[] args) {
        int[] arrs = {1,2,3,4,5,6,7,8,9};
        int[] copyArr = copyOfRange(arrs,3,7);
        System.out.println(Arrays.toString(copyArr));

    }
    public static int[] copyOfRange(int[] arr, int from, int to){
        int[] newArr = new int[to-from];
        int index = 0;
        for (int i = from; i < to; i++) {
            newArr[index] = arr[i];
            index++;
        }
        return newArr;
    }
}
