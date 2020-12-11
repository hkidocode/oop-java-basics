package polymorphisme;

public class Livre extends Ouvrage {
    private String auteur;

    public Livre(String titre, String dateCreation, boolean isExist, String auteur) {
        super(titre, dateCreation, isExist);
        this.auteur = auteur;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String afficher() {
        return super.afficher() + " - " + this.auteur;
    }
}
