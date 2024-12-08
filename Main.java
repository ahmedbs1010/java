import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        StudentManagement management = new StudentManagement();

        
        List<Etudiant> students = new ArrayList<>();
        students.add(new Etudiant(1, "Sarah", 20));
        students.add(new Etudiant(2, "Tassnim", 22));
        students.add(new Etudiant(3, "Rami", 19));

        
        System.out.println("Tous les etudiant :");
        management.displayStudents(students, System.out::println);

        
        System.out.println("\netudiant ages de plus de 20 ans :");
        management.displayStudentsByFilter(students, e -> e.getAge() > 20, System.out::println);

        
        String names = management.returnStudentsNames(students, Etudiant::getNom);
        System.out.println("\nNoms des etudiant : " + names);

        
        Etudiant newStudent = management.createStudent(() -> new Etudiant(4, "Sami", 21));
        students.add(newStudent);
        System.out.println("\netudiant cree : " + newStudent);

        // Trier les etudiant par ID
        List<Etudiant> sortedStudents = management.sortStudentsById(students, Comparator.comparingInt(Etudiant::getId));
        System.out.println("\netudiant tries par ID :");
        sortedStudents.forEach(System.out::println);

        
        System.out.println("\nFlux des etudiant :");
        management.convertToStream(students).forEach(System.out::println);
    }
}
