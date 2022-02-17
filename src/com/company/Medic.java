package com.company;

public class Medic extends Hero implements HavingSuperAbility{
    private int healPoints;

    public Medic(int healPoints) {
        this.healPoints = healPoints;
    }

    public void increase_experience(){

        int point = this.healPoints / 10;

        this.healPoints += point;
        System.out.println(point);
    }

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperAbility() {
        System.out.println( "Medic применил суперспособность CRITICAL DAMAGE");
    }
}
