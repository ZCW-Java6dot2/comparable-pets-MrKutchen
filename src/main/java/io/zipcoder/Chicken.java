package io.zipcoder;

public class Chicken extends Pet {

    public Chicken(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Cluck";
    }

}
