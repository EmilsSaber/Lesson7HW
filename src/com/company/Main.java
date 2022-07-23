package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

    Medic medic =  new Medic(20);


    Magic magic = new Magic();


    Warrior warrior = new Warrior();



        System.out.println("----------------------------------------------");

        HavingSuperAbility[] havingSuperAbilities ={medic,magic,warrior};
        for (int i = 0; i < havingSuperAbilities.length; i++) {
            havingSuperAbilities[i].applySuperAbility();
            medic.increase_experience();
        }

    }
}
