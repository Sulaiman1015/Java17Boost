package com.oop.fightInWord;

public class gameTest {
    public static void main(String[] args) {
        Role r1 = new Role("Bad",100);
        Role r2 = new Role("Good",100);
        while (true){
            r1.attack(r2);
            if (r2.getBlood() == 0){
                System.out.println(r1.getName()+" KO "+r2.getName()+", "+r1.getName()+" win.");
                break;
            }
            r2.attack(r1);
            if (r1.getBlood() == 0){
                System.out.println(r2.getName()+" KO "+r1.getName()+", "+r2.getName()+" win.");
                break;
            }

        }
    }
}
