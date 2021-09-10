package com.codingdojo.objm2;

import com.codingdojo.objm1.Human;

public class ChildHumanTest {
    public static final Ninja NINJA_2 = new Ninja();

    public static void main(String[] args) {
        Ninja ninja1 = new Ninja();
        Ninja ninja2 = new Ninja();
        System.out.println(ninja1.ninjaInfo());
        ninja2.runAway();
        System.out.println(ninja2.ninjaInfo());
        Human human1 =new Human();
        Human human2 = new Human();
        human1.humanInfo();
        Wizard wizard1 = new Wizard();
        Wizard wizard2 = new Wizard();
        wizard1.heal(human1);
        wizard2.fireball(human2);
        System.out.println(wizard1.wizardInfo());
        System.out.println(wizard2.wizardInfo());
        human1.humanInfo();
        human2.humanInfo();
        Samurai samurai1 = new Samurai();
        Samurai samurai2 = new Samurai();
        Samurai samurai3 = new Samurai();
        samurai1.deathBlow(human1);
        samurai2.meditate();
        human1.humanInfo();
        System.out.println(samurai1.samuraiInfo());
        System.out.println(samurai2.samuraiInfo());
        System.out.println(samurai3.samuraiInfo());


    }
}
