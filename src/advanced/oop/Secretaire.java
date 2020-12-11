package advanced.oop;

public class Secretaire extends Personne {
    private int numeroBureau;
    public static int numOfObjects = 0;

    public Secretaire(String nom, String prenom, String addresse, String dateNaissance, String ville, int numeroBureau) {
        super(nom, prenom, addresse, dateNaissance, ville);
        this.numeroBureau = numeroBureau;
        numOfObjects++;
    }

    public int getNumeroBureau() {
        return numeroBureau;
    }

    public void setNumeroBureau(int numeroBureau) {
        this.numeroBureau = numeroBureau;
    }
    public String toString() {
        return super.toString() + " - " + this.numeroBureau;
    }

    @Override
    public String ecrirePersonne() {
        return super.toString() + " - " + this.numeroBureau;
    }
}
