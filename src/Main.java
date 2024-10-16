import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;
import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Aquatic;
import tn.esprit.gestionzoo.entities.Zoo;





public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("Lions", "Lion", 12, true);
        Animal tiger = new Animal("Tigers", "Tiger", 8, true);
        Animal bear = new Animal("Bears", "Bear", 6, true);

        Zoo myZoo = new Zoo("Friguia Zoo", "Sousse");
        myZoo.addAnimal(tiger);
        myZoo.addAnimal(lion);

        myZoo.addAnimal(bear);

        myZoo.displayZoo();
        System.out.println(myZoo);

        myZoo.displayAnimals();


        int lionIndex = myZoo.searchAnimal(lion);
        System.out.println("Lion found at index: " + lionIndex);


        boolean added = myZoo.addAnimal(new Animal("Lions", "Lion", 5, true));
        System.out.println("Was the Lion added again? " + added);

        
        boolean removed = myZoo.removeAnimal(tiger);
        System.out.println("Was the Tiger removed? " + removed);

        Zoo anotherZoo = new Zoo("Belvidere Park", "Tunis");
        anotherZoo.addAnimal(new Animal("Elephants", "Elephant", 10, true));
        anotherZoo.addAnimal(new Animal("kongorou", "kongorou", 9, true));

        Zoo biggerZoo = Zoo.compareZoo(myZoo, anotherZoo);
        System.out.println("The bigger zoo is: " + biggerZoo);
        // Création des objets
        Dolphin dolphin = new Dolphin("Delphinidae", "Dolly", 3, true, "Ocean", 25.5f);
        Penguin penguin = new Penguin("Spheniscidae", "Pingu", 2, false, "Antarctica", 200f);

        // Affichage des informations des animaux
        System.out.println(dolphin);
        System.out.println(penguin);

        // Appel des méthodes swim
        dolphin.swim();
        penguin.swim();
    }
}
