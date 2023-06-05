package com.oop.fightInWord;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role(){}

    public Role(String name, int blood){
        this.name = name;
        this.blood = blood;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getBlood(){
        return blood;
    }
    public void setBlood(int blood){
        this.blood = blood;
    }

    public void attack(Role role){
        //make hurt 1-20
        Random r = new Random();
        int hurt = r.nextInt(20)+1;

        //left over blood after be attack
        int remainBlood = role.getBlood()-hurt < 0? 0 : role.getBlood()-hurt;
        role.setBlood(remainBlood);

        //this attack role
        System.out.println(this.name+" attack "+role.getName()+", "+role.getName()+" lost "+hurt+", he left over "+remainBlood);
    }
}
