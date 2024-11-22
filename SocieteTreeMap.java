import java.util.Map;
import java.util.TreeMap;

public class SocieteTreeMap implements InterfaceSociete {
    private Map<Employe, Departement> societe;

    public SocieteTreeMap() {
        this.societe = new TreeMap<>((e1, e2) -> e1.getCin().compareTo(e2.getCin()));
    }

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        societe.put(e, d);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        societe.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        societe.forEach((employe, departement) ->
                System.out.println(employe + " -> " + departement));
    }

    @Override
    public void afficherLesEmployes() {
        societe.keySet().forEach(System.out::println);
    }

    @Override
    public void afficherLesDepartements() {
        societe.values().stream().distinct().forEach(System.out::println);
    }

    @Override
    public void afficherDepartement(Employe e) {
        Departement d = societe.get(e);
        if (d != null) {
            System.out.println(d);
        } else {
            System.out.println("Employé non trouvé.");
        }
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return societe.containsKey(e);
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return societe.containsValue(d);
    }
}
