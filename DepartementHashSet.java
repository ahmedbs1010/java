
    import java.util.HashSet;
    import java.util.TreeSet;

    public class DepartementHashSet implements IDepartement<Departement> {
        private HashSet<Departement> departements = new HashSet<>();

        @Override
        public void ajouterDepartement(Departement departement) {
            departements.add(departement);
        }

        @Override
        public boolean rechercherDepartement(String nom) {
            return departements.stream().anyMatch(d -> d.getNomDepartement().equalsIgnoreCase(nom));
        }

        @Override
        public boolean rechercherDepartement(Departement departement) {
            return departements.contains(departement);
        }

        @Override
        public void supprimerDepartement(Departement departement) {
            departements.remove(departement);
        }


        @Override
        public void displayDepartement() {
            departements.forEach(System.out::println);
        }

        @Override
        public TreeSet<Departement> trierDepartementById() {
            TreeSet<Departement> sortedSet = new TreeSet<>((d1, d2) -> Integer.compare(d1.getId(), d2.getId()));
            sortedSet.addAll(departements);
            return sortedSet;
        }
    }


