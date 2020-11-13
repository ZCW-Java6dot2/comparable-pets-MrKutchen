package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.Scanner;

public class DisplayForPetsTest {

    @Test
    public void testPrintResultsDog() {
        String expectedInput = "Peter\n1\nDog\nFido\n";
        String expectedOutput = "Hello Peter, here are all your pets and their names with them speaking:\n"
        + "Fido says: Bark";
        System.setIn(new ByteArrayInputStream(expectedInput.getBytes()));
        Scanner scanner = new Scanner(System.in);

        DisplayForPets displayForPets = new DisplayForPets(scanner);

        PetOwner petOwner = displayForPets.generateOwnerAndPets();
        String actualOutput = displayForPets.printResults(petOwner);
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testPrintResultsCat() {
        String expectedInput = "Peter\n1\nCat\nFluffy\n";
        String expectedOutput = "Hello Peter, here are all your pets and their names with them speaking:\n"
                + "Fluffy says: Meow";
        System.setIn(new ByteArrayInputStream(expectedInput.getBytes()));
        Scanner scanner = new Scanner(System.in);

        DisplayForPets displayForPets = new DisplayForPets(scanner);

        PetOwner petOwner = displayForPets.generateOwnerAndPets();
        String actualOutput = displayForPets.printResults(petOwner);
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testPrintResultsChicken() {
        String expectedInput = "Peter\n1\nChicken\nRed\n";
        String expectedOutput = "Hello Peter, here are all your pets and their names with them speaking:\n"
                + "Red says: Cluck";
        System.setIn(new ByteArrayInputStream(expectedInput.getBytes()));
        Scanner scanner = new Scanner(System.in);

        DisplayForPets displayForPets = new DisplayForPets(scanner);

        PetOwner petOwner = displayForPets.generateOwnerAndPets();
        String actualOutput = displayForPets.printResults(petOwner);
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testPrintResultsMultiplePets() {
        String expectedInput = "Peter\n3\nChicken\nRed\nDog\nScooby\nCat\nWhiskers\n";
        String expectedOutput = "Hello Peter, here are all your pets and their names with them speaking:\n"
                + "Red says: Cluck\n" +
                "Scooby says: Bark\n" +
                "Whiskers says: Meow";
        System.setIn(new ByteArrayInputStream(expectedInput.getBytes()));
        Scanner scanner = new Scanner(System.in);

        DisplayForPets displayForPets = new DisplayForPets(scanner);

        PetOwner petOwner = displayForPets.generateOwnerAndPets();
        String actualOutput = displayForPets.printResults(petOwner);
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testSortingNameThenType() {
        String expectedInput = "Peter\n3\nChicken\nRed\nDog\nZuba\nCat\nAlfred\n";
        String expectedOutput = "[Pet{name='Alfred'}, Pet{name='Red'}, Pet{name='Zuba'}]";
        System.setIn(new ByteArrayInputStream(expectedInput.getBytes()));
        Scanner scanner = new Scanner(System.in);

        DisplayForPets displayForPets = new DisplayForPets(scanner);

        PetOwner petOwner = displayForPets.generateOwnerAndPets();
        Collections.sort(petOwner.getListOfPets());
        String actualOutput = String.valueOf(petOwner.getListOfPets());
        Assert.assertEquals(expectedOutput, actualOutput);
    }
}
