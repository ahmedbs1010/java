package tn.esprit.gestionzoo.entities;

public class Penguin extends AquaticAnimal {

    private float swimmingDepth;  // Profondeur de nage du pingouin

    public Penguin(String species, String name, int age, boolean isCarnivore, String habitat, float swimmingDepth) {
        super(species, name, age, isCarnivore, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public void swim() {
        System.out.println("The penguin is swimming at a depth of " + swimmingDepth + " meters.");
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "swimmingDepth=" + swimmingDepth +
                "} " + super.toString();
    }
}
