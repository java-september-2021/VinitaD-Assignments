package com.zk1;

public class Mammal {
    //member variable
    public Integer energyLevel; //access modifier-public, private
    //method
    public Integer displayEnergy() {
        System.out.println("my energy level " + this.energyLevel);
        return this.energyLevel;
    }
    //constructor
    public Mammal(Integer energyLevel) {
        this.energyLevel = 100;
    }

    /*public static class Gorilla extends Mammal {
        public Gorilla(Integer energyLevel) {
            super(energyLevel);
        }
        public void throwSomething() {
            System.out.println("com.zk1.Mammal.Gorilla has thrown something");
            energyLevel -= 5;
        }
        public void eatBananas() {
            System.out.println("eating bananas");
            energyLevel += 10;
        }
        public void climb() {
            System.out.println("climbing stuff here");
            energyLevel -= 10;
        }
    }*/
}