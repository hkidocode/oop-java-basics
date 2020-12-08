package com.company;

public class Account {
    public String nom;
    public String address;
    public float solde;

    public void printAccountInfos() {
        System.out.println(nom + " habite à (" + address + ") - " + "infos solde " + solde + " DH");
    }
}
