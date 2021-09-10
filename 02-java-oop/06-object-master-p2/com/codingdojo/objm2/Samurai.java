package com.codingdojo.objm2;
import com.codingdojo.objm1.*;

public class Samurai extends Human{
    public static int count = 0;
    public  Samurai() {
        this.health = 200;
        Samurai.count++;
    }
    public void deathBlow(Human name) {
        this.health = this.health/2;
        name.health = 0;
    }
    public void meditate() {
        this.health += this.health/2;
    }
    public static int howMany() {
        return Samurai.count;
    }
    public String samuraiInfo() {
        return("our count is "+ Samurai.count + ". My health status is "+ this.health);
    }
}

// Samurai: Set a default health of 200

// ● Samurai: Add a method deathBlow(Human) that kills the other human, but reduces the Samurai's health by half

// ● Samurai: Add a method meditate() that heals the Samurai for half of their current health.

// ● Samurai: Add a method howMany() that returns the total current number of Samurai.