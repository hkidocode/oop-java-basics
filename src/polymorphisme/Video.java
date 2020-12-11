package polymorphisme;

public class Video extends Ouvrage {
    private String editeur;
    private int duree;

    public Video(String titre, String dateCreation, boolean isExist, String editeur, int duree) {
        super(titre, dateCreation, isExist);
        this.editeur = editeur;
        this.duree = duree;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String afficher() {
        return super.afficher() + " - " + this.editeur + " - " + this.duree;
    }
}
