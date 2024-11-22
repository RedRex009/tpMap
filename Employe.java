public class Employe {
    private String cin;
    private String matricule;
    private String nom;
    private String prenom;

    // Constructeur sans paramètre
    public Employe() {}

    // Constructeur avec paramètres
    public Employe(String cin, String matricule, String nom, String prenom) {
        this.cin = cin;
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
    }

    // Getters et setters
    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    // toString()
    @Override
    public String toString() {
        return "Employe{" +
                "cin='" + cin + '\'' +
                ", matricule='" + matricule + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

    // equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Employe employe = (Employe) obj;

        return cin != null ? cin.equals(employe.cin) : employe.cin == null;
    }

    @Override
    public int hashCode() {
        return cin != null ? cin.hashCode() : 0;
    }
}
