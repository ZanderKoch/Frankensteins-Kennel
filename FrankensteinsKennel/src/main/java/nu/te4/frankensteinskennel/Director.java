/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.frankensteinskennel;

import java.util.Scanner;

/**
 *
 * @author Zander Koch
 */
public class Director{

    public static void main(String[] args){
        int legs;
        int heads;
        int tails;
        String name;
        String sex;
        String species = null;

        //PetBuilder builder;
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "Welcome to Dr Frankenstein's kennel and workshop!");

        while(!("dog".equals(species) || "cat".equals(species))){
            System.out.println(
                    "What kind of pet would you like? (dog/cat)");
            species = scanner.nextLine();
        }
            System.out.println("A wise choice! What will their name be?");
            name = scanner.nextLine();
            
            System.out.println(
                    "That's a good name! Would you like a male or female "
                    + species);
            sex = scanner.nextLine();

            System.out.println("That makes sense. How many legs would"
                    + " you like it to have?");
            legs = scanner.nextInt();

            System.out.println("A bold decision! How many tails?");
            tails = scanner.nextInt();

            System.out.println("Oooh, I like that! How many heads?");
            heads = scanner.nextInt();

            System.out.println("Well, that's a bit unorthodox. Anyway, "
                    + "here's your " + species);
        

    }
}
