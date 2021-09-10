package com.zk1;

public class GorillaTest {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla(30);
        gorilla.throwSomething();
        gorilla.throwSomething();
        gorilla.throwSomething();
        gorilla.eatBananas();
        gorilla.eatBananas();
        gorilla.climb();
        System.out.println(gorilla.displayEnergy());

    }
}