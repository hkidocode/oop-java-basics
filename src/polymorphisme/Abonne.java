package polymorphisme;

import java.util.ArrayList;

public class Abonne {
    private int id;
    private String nom;
    private int numAbonnement;
    private Ouvrage ouvrage;

    public Abonne(int id, String nom, int numAbonnement, Ouvrage ouvrage) {
        this.id = id;
        this.nom = nom;
        this.numAbonnement = numAbonnement;
        this.ouvrage = ouvrage;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumAbonnement() {
        return numAbonnement;
    }

    public void setNumAbonnement(int numAbonnement) {
        this.numAbonnement = numAbonnement;
    }


    public Ouvrage getOuvrage() {
        return ouvrage;
    }

    public void setOuvrage(Ouvrage ouvrage) {
        this.ouvrage = ouvrage;
    }

    public String afficher() {
        return this.id + " - " + this.nom + " - " + this.numAbonnement + " - " + this.ouvrage.getTitre();
    }
}
