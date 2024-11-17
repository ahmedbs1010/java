package tn.esprit.gestionzoo.entities;

public class Dolphin extends AquaticAnimal {

    private float swimmingSpeed;  // Vitesse de nage du dauphin

    public Dolphin(String species, String name, int age, boolean isCarnivore, String habitat, float swimmingSpeed) {
        super(species, name, age, isCarnivore, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void swim() {
        System.out.println("The dolphin is swimming at " + swimmingSpeed + " km/h.");
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
        return "Dolphin{" +
                "swimmingSpeed=" + swimmingSpeed +
                "} " + super.toString();
    }
}
