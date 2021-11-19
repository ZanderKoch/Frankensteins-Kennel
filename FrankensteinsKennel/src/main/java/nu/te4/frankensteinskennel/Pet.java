/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.frankensteinskennel;

/**
 *
 * @author Zander Koch
 */
public abstract class Pet{
    protected int legs;
    protected int heads;
    protected int tails;
    protected String name;
    protected String sex;
    protected String species;
    
    public abstract Pet(PetBuilder petBuilder){
        this.legs = petBuilder.getLegs();
        this.heads = petBuilder.getHeads();
        this.tails = petBuilder.getTails();
        this.name = petBuilder.getName();
        this.sex = petBuilder.getSex();
        this.species = petBuilder.getSpecies();
        
    }
    
    public void present(){
        this.speakUp();
        System.out.println("My name is " + this.name + "And I am a "
                + this.species);
        System.out.println("I have " + this.heads + "heads and "
                + Integer.toString(this.legs) + " legs.");
        System.out.println("Also I have " + Integer.toString(this.tails)
                + "tails and I am a" + this.sex);
        System.out.println("My life is a mess");
    }
    
    protected abstract void speakUp();
}
