package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

    Medic medic =  new Medic(20);
    medic.applySuperAbility();

    Magic magic = new Magic();
    magic.applySuperAbility();

    Warrior warrior = new Warrior();
    warrior.applySuperAbility();


        System.out.println("----------------------------------------------");

        HavingSuperAbility[] havingSuperAbilities ={medic,magic,warrior};
        for (int i = 0; i < havingSuperAbilities.length; i++) {
            havingSuperAbilities[i].applySuperAbility();
//            havingSuperAbilities[i].increase_experience();
//            ((Medic) havingSuperAbilities[i]).increase_experience();
            medic.increase_experience();
        }
//        medic.increase_experience();

    }
}
