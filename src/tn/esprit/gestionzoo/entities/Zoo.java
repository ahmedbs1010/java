package tn.esprit.gestionzoo.entities;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String name;
    private String location;
    private int capacity;
    private List<Animal> animals;
    private List<Aquatic> aquaticAnimals;

    public Zoo(String name, String location, int capacity) {
        this.name = name;
        this.location = location;
        this.capacity = capacity;
        this.animals = new ArrayList<>();
        this.aquaticAnimals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) throws ZooFullException {
        if (animals.size() >= capacity) {
            throw new ZooFullException("Le zoo est plein, impossible d'ajouter plus d'animaux !");
        }
        animals.add(animal);
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        aquaticAnimals.add(aquatic);
    }

    public void displayAquaticAnimalsSwim() {
        for (Aquatic aquatic : aquaticAnimals) {
            aquatic.swim();
        }
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Penguin) {
                maxDepth = Math.max(maxDepth, ((Penguin) aquatic).getSwimmingDepth());
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int dolphins = 0;
        int penguins = 0;
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Dolphin) {
                dolphins++;
            } else if (aquatic instanceof Penguin) {
                penguins++;
            }
        }
        System.out.println("Nombre de dauphins : " + dolphins);
        System.out.println("Nombre de pingouins : " + penguins);
    }

    public void displayAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
