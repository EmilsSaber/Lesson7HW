package com.company;

public abstract class Hero implements HavingSuperAbility {
    private int hit;
    private int health;
    private String Passive;


    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getPassive() {
        return Passive;
    }

    public void setPassive(String passive) {
        Passive = passive;
    }

    public abstract void applySuperAbility();

}
