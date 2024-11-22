public class Departement {
    private int id;
    private String nom;

    // Constructeur sans paramètre
    public Departement() {}

    // Constructeur avec paramètres
    public Departement(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    // Getters et setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    // toString()
    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }

    // equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Departement that = (Departement) obj;

        return id == that.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
