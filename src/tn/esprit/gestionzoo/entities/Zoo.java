// Fichier: Zoo.java
package tn.esprit.gestionzoo.entities;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private static final int MAX_ANIMALS = 25;
    private static final int MAX_AQUATIC_ANIMALS = 10;

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

    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Le zoo est plein. Impossible d'ajouter plus d'animaux.");
            return false;
        }
        if (animals.contains(animal)) {
            System.out.println("Cet animal est déjà dans le zoo.");
            return false;
        }
        animals.add(animal);
        return true;
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        if (aquaticAnimals.size() < MAX_AQUATIC_ANIMALS) {
            aquaticAnimals.add(aquatic);  // Ajout d'un animal aquatique à la liste
        } else {
            System.out.println("Le zoo a atteint le nombre maximum d'animaux aquatiques.");
        }
    }

    public boolean removeAnimal(Animal animal) {
        return animals.remove(animal);
    }

    public boolean isZooFull() {
        return animals.size() >= capacity;
    }

    public void displayAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
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

    public void displaySwimOfAllAquatics() {
        for (Aquatic aquatic : aquaticAnimals) {
            aquatic.swim();  // Appel de la méthode swim pour chaque animal aquatique
        }
    }

    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;

        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Dolphin) {
                dolphinCount++;
            } else if (aquatic instanceof Penguin) {
                penguinCount++;
            }
        }

        System.out.println("Nombre de dauphins : " + dolphinCount);
        System.out.println("Nombre de pingouins : " + penguinCount);
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).equals(animal)) {
                return i;  // Retourne l'index de l'animal
            }
        }
        return -1;  // Retourne -1 si l'animal n'est pas trouvé
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", capacity=" + capacity +
                ", animals=" + animals.size() +
                ", aquaticAnimals=" + aquaticAnimals.size() +
                '}';
    }
}
