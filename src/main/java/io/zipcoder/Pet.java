package io.zipcoder;

public class Pet implements Comparable<Pet>{

    private String name;

    public String speak() {
        return "noise";
    }

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Pet compareName) {
        return this.getName().compareTo(compareName.getName());
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }
}
