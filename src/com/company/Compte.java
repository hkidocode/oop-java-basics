package com.company;

public class Compte {
    public String nom;
    public String address;
    public float solde;

    public void afficherInfosSolde() {
        System.out.println("Votre solde est : " + solde);
    }

    public float calculateInteret(float tauxInteret) {
        return this.solde + (this.solde * tauxInteret);
    }
}
