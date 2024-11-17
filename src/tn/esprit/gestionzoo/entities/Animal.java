package tn.esprit.gestionzoo.entities;

public class Animal {
    private String species;
    private String name;
    private int age;
    private boolean isCarnivore;

    public Animal(String species, String name, int age, boolean isCarnivore) {
        this.species = species;
        this.name = name;
        this.age = age;
        this.isCarnivore = isCarnivore;
    }

    public String getSpecies() {
        return species;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isCarnivore() {
        return isCarnivore;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isCarnivore=" + isCarnivore +
                '}';
    }
}
