package polymorphisme;

public class Employee extends Personne {
    private float salaire;

    public Employee(String nom, String prenom, String addresse, int dateNaissance, String ville, float salaire) {
        super(nom, prenom, addresse, dateNaissance, ville);
        this.salaire = salaire;
    }

    public float getSalaire() {
        return salaire;
    }

    public void setSalaire(float salaire) {
        this.salaire = salaire;
    }

    public String afficher() {
        return super.afficher() + " - " + this.salaire;
    }
}
