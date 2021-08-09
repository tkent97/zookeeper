package com.hope.zookeeper;

public class BatTest {

    public static void main(String[] args) {

        Bat b = new Bat();
        System.out.println("----- Attack Town Test ------");
        for (int i = 0; i < 3; i++) {
            b.attackTown();
        }
        System.out.println("----- Eat Humans Test ------");
        for (int i = 0; i < 2; i++) {
            b.eatHumans();
        }

        System.out.println("----- Fly Test ------");
        for (int i = 0; i < 2; i++) {
            b.fly();
        }

    }
}