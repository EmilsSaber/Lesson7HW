package com.company;

public class Warrior extends Hero implements HavingSuperAbility{
    @Override
    public void applySuperAbility() {
        System.out.println("Warrior применил суперспособность CRITICAL DAMAGE");
    }
}
