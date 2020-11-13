package io.zipcoder;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PetOwner {

    private String petOwner;
    private ArrayList<Pet> listOfPets;


    public PetOwner(String petOwner, List<Pet> listOfPets) {
        this.petOwner = petOwner;
        this.listOfPets = (ArrayList<Pet>) listOfPets;
    }

    public String getPetOwner() {
        return petOwner;
    }

    public void setPetOwner(String petOwner) {
        this.petOwner = petOwner;
    }

    public ArrayList<Pet> getListOfPets() {
        return listOfPets;
    }

    public void setListOfPets(ArrayList<Pet> listOfPets) {
        this.listOfPets = listOfPets;
    }

    public void sortPetsByName(ArrayList<Pet> listOfPets) {
    }
}
