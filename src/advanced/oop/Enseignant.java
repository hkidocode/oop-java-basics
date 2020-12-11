package advanced.oop;

public class Enseignant extends Personne {
    private String specialite;
    public static int numOfObjects = 0;


    public Enseignant(String nom, String prenom, String addresse, String dateNaissance, String ville, String specialite) {
        super(nom, prenom, addresse, dateNaissance, ville);
        this.specialite = specialite;
        numOfObjects++;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public String toString() {
        return super.toString() + " - " + this.specialite;
    }

    @Override
    public String ecrirePersonne() {
        return super.toString() + " - " + this.specialite;
    }
}
