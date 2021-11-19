/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.frankensteinskennel;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 *
 * @author Zander Koch
 */
public class Dog extends Pet{

    public Dog(PetBuilder builder){
        this.legs = builder.getLegs();
        this.heads = builder.getHeads();
        this.tails = builder.getHeads();
        this.name = builder.getName();
        this.sex = builder.getSex();
        this.species = builder.getSpecies();
    }

    public void speakUp(){
        System.out.println("Woof");
    }
}
