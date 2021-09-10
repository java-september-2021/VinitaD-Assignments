package com.codingdojo.objm2;
import com.codingdojo.objm1.*;
public class Wizard extends Human{
    public Wizard(){
        this.health = 50;
        this.intelligence = 8;
    }
    public void heal(Human target) {target.health += this.intelligence;
    }
    public void fireball(Human target) {
        target.health -= (this.intelligence*3);
    }
    public String wizardInfo(){
        return("My Health is "+ this.health +" and my Intelligence is " + this.intelligence);
    }

}
// ● Wizard: Set default health to 50

// ● Wizard: Set default intelligence to 8

// ● Wizard: Add a method heal(Human) that heals the other human by the wizard's intelligence

// ● Wizard: Add a method fireball(Human) that decreases the other human's health by the wizard's intelligence * 3