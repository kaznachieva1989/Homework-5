package com.company;

import java.util.Random;

public class Boss {
    public int health;
    public int damage;
    public String defenceType;

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

    public String getDefenceType() {
        return defenceType;
    }

    public void setDefenceType(String defenceType) {
        this.defenceType = defenceType;
    }

    public void changeBossDefence() {
        Random r = new Random();
        int randomNumber = r.nextInt(50);
        int defenceType = randomNumber;
    }
}