package io.zipcoder;

import java.util.Collections;
import java.util.Scanner;

public class Engine {

    public static void runEngine() {
        Scanner scanner = new Scanner(System.in);

        DisplayForPets display = new DisplayForPets(scanner);

        PetOwner petOwner = display.generateOwnerAndPets();
        System.out.println(display.printResults(petOwner));
        System.out.println(petOwner.getListOfPets());
        Collections.sort(petOwner.getListOfPets());
        System.out.println(petOwner.getListOfPets());
    }
}
