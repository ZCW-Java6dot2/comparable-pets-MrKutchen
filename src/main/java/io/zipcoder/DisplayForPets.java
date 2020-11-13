package io.zipcoder;

import java.util.ArrayList;
import java.util.Scanner;

public class DisplayForPets {

    private Scanner scanner;

    public DisplayForPets(Scanner scanner) {
        this.scanner = scanner;
    }

    public PetOwner generateOwnerAndPets() {
        System.out.println("Hello, what is your name?");
        pleasePrintHere();
        String ownerName = scanner.nextLine();
        System.out.println("How many pets do you own?");
        pleasePrintHere();
        Integer numberOfPetsOwned = scanner.nextInt();
        ArrayList<Pet> listOfPets = createKindOfPets(numberOfPetsOwned);
        return new PetOwner(ownerName, listOfPets);
    }

    public ArrayList<Pet> createKindOfPets(int numberOfPetsOwned) {
        ArrayList<Pet> pet = new ArrayList<>();
        for (int i = 1; i <= numberOfPetsOwned; i++) {
            System.out.println("What kind of animal is pet " + i + " (dog, cat, or chicken)?");
            pleasePrintHere();
            String typeOfPet = scanner.next();
            if (typeOfPet.toLowerCase().equals("dog")) {
                scanner.nextLine();
                System.out.println("What is the name of the pet?");
                pleasePrintHere();
                pet.add(new Dog(scanner.nextLine()));
            } else if (typeOfPet.toLowerCase().equals("cat")) {
                scanner.nextLine();
                System.out.println("What is the name of the pet?");
                pleasePrintHere();
                pet.add(new Cat(scanner.nextLine()));
            } else if(typeOfPet.toLowerCase().toLowerCase().equals("chicken")){
                scanner.nextLine();
                System.out.println("What is the name of the pet?");
                pleasePrintHere();
                pet.add(new Chicken(scanner.nextLine()));
            } else {
                System.out.println("Please enter dog, cat, or chicken for the kind of animal you own. ");
            }
        }
        return pet;
    }

    public void pleasePrintHere() {
        System.out.print("Please print here -> ");
    }

    public String printResults(PetOwner petOwner) {
        StringBuilder resultsString = new StringBuilder("Hello " + petOwner.getPetOwner() + ", here are all your pets and their names with them speaking:");
        for (Pet aPet : petOwner.getListOfPets()) {
            resultsString.append("\n").append(aPet.getName()).append(" says: ").append(aPet.speak());
        }
        return resultsString.toString();
    }
}
