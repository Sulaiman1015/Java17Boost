package org.example;

public class ArraySort {
    public static void main(String[] args) {
        int[] array = {2,45,21,4,67,6,56,18,75,224};
        // bubble sort from small to big
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j] > array[j+1]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        //  System.out.println(Arrays.toString(array));
    }
}
