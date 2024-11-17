package tn.esprit.gestionzoo.entities;

public abstract class AquaticAnimal extends Animal implements Aquatic {
    private String habitat;

    // Constructeur de la classe abstraite
    public AquaticAnimal(String species, String name, int age, boolean isCarnivore, String habitat) {
        super(species, name, age, isCarnivore);  // Appel au constructeur de la classe Animal
        this.habitat = habitat;
    }

    @Override
    public String getHabitat() {
        return habitat;
    }

    @Override
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        AquaticAnimal other = (AquaticAnimal) obj;
        return this.getName().equals(other.getName()) &&
                this.getAge() == other.getAge() &&
                this.habitat.equals(other.habitat);
    }

    @Override
    public String toString() {
        return "AquaticAnimal{" +
                "habitat='" + habitat + '\'' +
                "} " + super.toString();
    }
}
