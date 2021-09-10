package com.codingdojo.objm2;
import com.codingdojo.objm1.*;
public class Ninja extends Human {
    // protected int stealth = 10;
    public Ninja(){
        this.stealth = 10;
    }
    public void steal(Human name) {
        name.stealth -= this.stealth;
        this.stealth += this.stealth;
    }
    public void runAway(){
        this.health -= 10;
    }
    public String ninjaInfo() {
        return ("My Health status is " + this.health+ ". My stealth is " + this.stealth+ ".");
    }

}

// Ninja: Set default stealth to 10

// ● Ninja: Add a method steal(Human) that takes the amount of stealth the ninja has, removes it from the other human's health, and adds it to the ninja's

// ● Ninja: Add a method runAway() that decreases their health by 10