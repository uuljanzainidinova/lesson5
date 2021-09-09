package com.company;

import javax.crypto.CipherOutputStream;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss() {
        };
        boss.setHealth(100);
        boss.setDamage(90);
        boss.setDefenceType("Reverse hero's damage");

        System.out.println("BossHealth:" + " " + boss.getHealth() + "  " +
                ("BossDamage:" + " " + boss.getDamage() + "  " + "BossDefenceType:" + " " + boss.getDefenceType()));

        /*createHeroes();{
            for (int i = 0; i < 2; i++) {
                System.out.println();
            }

        }*/
    }


   /* public static void createHeroes() {
        Hero hero1 = new Hero() {
        };
        hero1.setHealth(200);
        hero1.setDamage(230);
        hero1.setSuperpower(300);

        Hero hero2 = new Hero();
        hero2.setHealth(32);
        hero2.setDamage(34);

        Hero hero3 = new Hero(34, 67);

        Hero[] Hero = new Hero[]{hero1, hero2, hero3};
        return;

    }*/
}







