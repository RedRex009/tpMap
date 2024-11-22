public class Main {
    public static void main(String[] args) {
        InterfaceSociete societe = new SocieteHashMap();

        Employe e1 = new Employe("CIN001", "M001", "Alice", "Dupont");
        Employe e2 = new Employe("CIN002", "M002", "Bob", "Martin");

        Departement d1 = new Departement(1, "Informatique");
        Departement d2 = new Departement(2, "RH");

        societe.ajouterEmployeDepartement(e1, d1);
        societe.ajouterEmployeDepartement(e2, d2);

        societe.afficherLesEmployesLeursDepartements();
    }
}
