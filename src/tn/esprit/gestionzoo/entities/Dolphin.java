package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
    private float swimmingSpeed;

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }


    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    @Override
    public String toString() {
        return "Dolphin{" +
                "swimmingSpeed=" + swimmingSpeed +
                ", habitat='" + getHabitat() + '\'' +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                "} " + super.toString();
    }

    public void swim() {
        System.out.println("This dolphin is swimming.");
    }
}
