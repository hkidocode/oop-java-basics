package advanced.oop;

public class Employee {
    private String nom;
    private String prenom;
    private String addresse;
    private int anneeNaissance;
    private int anneeEnCours;

    public Employee(String nom, String prenom, String addresse, int anneeNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.addresse = addresse;
        this.anneeNaissance = anneeNaissance;
    }

    public Employee(String nom, String prenom, String addresse, int anneeNaissance, int anneeEnCours) {
        this(nom, prenom, addresse, anneeNaissance);
        this.anneeEnCours  = anneeEnCours;
    }

    public int calculateAge() {
        return this.anneeEnCours - this.anneeNaissance;
    }

    public void afficherInfosClient() {
        System.out.println(this.nom + " " + this.prenom + ", né le " + this.anneeNaissance + " habitant à " + this.addresse);
    }
}
