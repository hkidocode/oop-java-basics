package advanced.oop;

public class Etudiant extends Personne {
    private String diplome;
    public static int numOfObjects = 0;

    public Etudiant(String nom, String prenom, String addresse, String dateNaissance, String ville, String diplome) {
        super(nom, prenom, addresse, dateNaissance, ville);
        this.diplome = diplome;
        numOfObjects++;
    }

    public String getDiplome() {
        return diplome;
    }

    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }

    public String toString() {
        return super.toString() + " - " + this.diplome;
    }

    @Override
    public String ecrirePersonne() {
        return super.toString() + " - " + this.diplome;
    }
}
