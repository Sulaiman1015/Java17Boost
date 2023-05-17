package org.example;

import java.util.Scanner;

public class SellsTickets {
    public static void main(String[] args) {
        //price*90% if 0 Business class, price*85% if 2 Economy class in month 5 - 10;
        //price*70% if 1 Business class, price*65% if 2 Economy class in month 11 - 04;
        sellsTickets();

    }

    public static double sellsTickets(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a month ( 1-12): ");
        int month = sc.nextInt();
        double priceFinal = 0;
        if(month >= 5 && month <=10){
            System.out.println("press '0 Business class', press '1 Economy class': ");
            int seat = sc.nextInt();
            if(seat == 0){
                System.out.println("enter a price: ");
                int price = sc.nextInt();
                priceFinal = price*0.9 ;
                System.out.println("your price is "+priceFinal);
            } else if (seat == 1) {
                System.out.println("enter a price: ");
                int price = sc.nextInt();
                priceFinal = price*0.85 ;
                System.out.println("your price is "+priceFinal);
            } else {
                System.out.println("press 0 or 1");
            }
        } else if ((month >= 1 && month <= 4) || (month >=11 && month <=12)) {
            System.out.println("press '0 Business class', press '1 Economy class': ");
            int seat = sc.nextInt();
            if(seat == 0){
                System.out.println("enter a price: ");
                int price = sc.nextInt();
                priceFinal = price*0.7 ;
                System.out.println("your price is "+priceFinal);
            } else if (seat == 1) {
                System.out.println("enter a price: ");
                int price = sc.nextInt();
                priceFinal = price*0.65 ;
                System.out.println("your price is "+priceFinal);
            } else {
                System.out.println("press 0 or 1");
            }
        } else {
            System.out.println("enter a number between 1-12");
        }
        return priceFinal;
    }

    //another way
    public static double discountPrice(int month, int seat, double d1, double discount2, double d3, double discount4){
        double price = 0;
        if(month >= 5 && month <=10){

            if(seat == 0){

            } else if (seat == 1) {

            }
        } else if ((month >= 1 && month <= 4) || (month >=11 && month <=12)) {
            if(seat == 0){

            } else if (seat == 1) {

            }
        }
        return price;
    }
}
