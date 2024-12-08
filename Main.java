import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        DepartementHashSet gestionDepartement = new DepartementHashSet();
        AffectationHashMap affectation = new AffectationHashMap();

        Departement d1 = new Departement(1, "IT", 20);
        Departement d2 = new Departement(2, "HR", 15);
        Departement d3 = new Departement(3, "Reseau", 10);


        gestionDepartement.ajouterDepartement(d1);
        gestionDepartement.ajouterDepartement(d2);
        gestionDepartement.ajouterDepartement(d3);

        
        System.out.println("Liste des departements :");
        gestionDepartement.displayDepartement();

        System.out.println("\nRecherche du departement 'HR': " + gestionDepartement.rechercherDepartement("HR"));
        System.out.println("Recherche du departement 'Reseau': " + gestionDepartement.rechercherDepartement(d3));

        System.out.println("\nSuppression du departement 'Reseau':");
        gestionDepartement.supprimerDepartement(d3);
        gestionDepartement.displayDepartement();

        System.out.println("\ndepartements tries par ID :");
        TreeSet<Departement> sortedDepartments = gestionDepartement.trierDepartementById();
        sortedDepartments.forEach(System.out::println);


        SocieteArrayList gestionEmployes = new SocieteArrayList();

        Employe e1 = new Employe(1, "Mhaysi", "Ahmed", "", 3);
        Employe e2 = new Employe(2, "Mouihbi", "Hana", "", 2);
        Employe e3 = new Employe(3, "Tounsi", "Amal", "Reseau", 4);

        gestionEmployes.ajouterEmploye(e1);
        gestionEmployes.ajouterEmploye(e2);
        gestionEmployes.ajouterEmploye(e3);

        affectation.ajouterEmployeDepartement(e1, d1);
        affectation.ajouterEmployeDepartement(e2, d2);
        affectation.afficherEmployesEtDepartements();

        affectation.ajouterEmployeDepartement(e1, d2);
        affectation.afficherEmployesEtDepartements();

        affectation.supprimerEmploye(e1);
        affectation.afficherEmployesEtDepartements();


        affectation.ajouterEmployeDepartement(e1, d1);
        affectation.supprimerEmployeEtDepartement(e1, d1);
        affectation.afficherEmployesEtDepartements();

        System.out.println("Employé Mhaysi existe ? " + affectation.rechercherEmploye(e2));
        System.out.println("Département IT existe ? " + affectation.rechercherDepartement(d1));
        System.out.println("Employés triés : " + affectation.trierMap());

        System.out.println("\nListe des employes :");
        gestionEmployes.displayEmploye();

        System.out.println("\nRecherche de l'employe 'Mouihbi': " + gestionEmployes.rechercherEmploye("Mouihbi"));
        System.out.println("Recherche de l'employe 'Tounsi': " + gestionEmployes.rechercherEmploye(e3));

        System.out.println("\nSuppression de l'employe 'Mouihbi':");
        gestionEmployes.supprimerEmploye(e2);
        gestionEmployes.displayEmploye();

        System.out.println("\nemployes tries par ID :");
        gestionEmployes.trierEmployeParId();
        gestionEmployes.displayEmploye();

        System.out.println("\nemployes tries par departement et grade :");
        gestionEmployes.trierEmployeParNomDepartementEtGrade();
        gestionEmployes.displayEmploye();
    }
}
