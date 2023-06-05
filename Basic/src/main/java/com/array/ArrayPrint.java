package com.array;

public class ArrayPrint {
    public static void main(String[] args) {
        int[] arrs = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for (int arr:arrs) {
            sum += arr;
            if(arr%3 == 0){
                System.out.println(arr+"%3 = 0");
            }else if(arr%2 == 0){

                System.out.println(arr+"/2 = "+arr/2);
            }else{

                System.out.println(arr+"*2 = "+arr*2);
            }
        }
        System.out.println("sum = "+sum);
    }
}
