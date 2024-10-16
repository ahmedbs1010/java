package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.entities.Animal;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private final int nbrCages = 25;
    private int currentAnimalCount;

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[nbrCages];
        this.currentAnimalCount = 0;
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull() || searchAnimal(animal) != -1) {
            return false;
        }
        animals[currentAnimalCount] = animal;
        currentAnimalCount++;
        return true;
    }

    public void displayAnimals() {
        if (currentAnimalCount == 0) {
            System.out.println("No animals in the zoo.");
            return;
        }
        for (int i = 0; i < currentAnimalCount; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < currentAnimalCount; i++) {
            if (animals[i].equals(animal)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            return false;
        }
        for (int i = index; i < currentAnimalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[currentAnimalCount - 1] = null;
        currentAnimalCount--;
        return true;
    }

    public boolean isZooFull() {
        return currentAnimalCount >= nbrCages;
    }

    public static Zoo compareZoo(Zoo z1, Zoo z2) {
        return (z1.currentAnimalCount > z2.currentAnimalCount) ? z1 : z2;
    }

    public void displayZoo() {
        System.out.println("Zoo [Name: " + name + ", City: " + city + ", Number of Cages: " + nbrCages + "]");
    }


    public String toString() {
        return "Zoo [Name: " + name + ", City: " + city + ", Number of Cages: " + nbrCages + "]";
    }
}

