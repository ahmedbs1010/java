package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal {
    private String habitat;

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }


    public String getHabitat() {
        return habitat;
    }

    @Override
    public String toString() {
        return "Aquatic{" +
                "habitat='" + habitat + '\'' +
                "} " + super.toString();
    }
}
