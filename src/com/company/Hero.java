package com.company;

public class Hero {
    private int health;
    private int damage;
    private int superpower;

    public Hero(){
        this.health = health;
        this.damage = damage;
        this.superpower = superpower;

    }
    public Hero(int health, int damage){
        this.health = health;
        this.damage = damage;


    }



    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getSuperpower() {
        return superpower;
    }

    public void setSuperpower(int superpower) {
        this.superpower = superpower;
    }
}

