import java.util.Objects;


public class Departement {
    private int id;
    private String nomDepartement;
    private int nbEmployes;

    
    public Departement() {
    }


    
    public Departement(int id, String nomDepartement, int nbEmployes) {
        this.id = id;
        this.nomDepartement = nomDepartement;
        this.nbEmployes = nbEmployes;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public int getnbEmployes() {
        return nbEmployes;
    }

    public void setnbEmployes(int nbEmployes) {
        this.nbEmployes = nbEmployes;
    }

    
   

   
    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nomDepartement='" + nomDepartement + '\'' +
                ", nbEmployes=" + nbEmployes +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departement that = (Departement) o;
        return Objects.equals(nomDepartement, that.nomDepartement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomDepartement);
    }

  
}
