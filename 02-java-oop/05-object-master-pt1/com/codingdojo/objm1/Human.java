package com.codingdojo.objm1;

public class Human{
    public int strength= 3;
    public int stealth= 3;
    public int intelligence= 3;
    public double health = 100;
    public void attack(Human name) {
        name.health -= this.strength;
    }
    public void humanInfo(){
        System.out.println("Strength: "+ this.strength + "Stealth: " +this.stealth + "intelligence: " + this.intelligence + "Health" + this.health);
    }
}
