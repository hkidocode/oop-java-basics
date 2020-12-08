package com.company;

public class Accounts {
    private String nom;
    private String address;
    private float solde;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    public float retirer(float montant) {
        if(montant > this.solde) {
            System.out.println("Le montant est plus grand que du solde. Veuillez réssayer!");
        }
        return (this.solde - montant);
    }
}
