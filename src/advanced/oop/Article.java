package advanced.oop;

public class Article {
    private String nom;
    private int prix;

    public Article(String nom, int prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public String afficher() {
        return "Le prix de cette article " + this.nom + " est : " + prix + "DH.";
    }
}
