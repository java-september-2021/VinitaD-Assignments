package com.codingdojo.objm1;

public class HumanTest {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human();
        human1.attack(human2);
        human1.humanInfo();
        human2.humanInfo();
    }
}