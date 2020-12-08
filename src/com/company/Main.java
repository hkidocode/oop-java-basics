package com.company;

public class Main {

    public static void main(String[] args) {
        // Exercice 1
        Chien chien = new Chien();
        chien.nom = "Rex";
        chien.aboyer();
        chien.manger();

        Chien chien1 = new Chien();
        chien1.nom = "Max";
        chien1.aboyer();
        chien1.manger();
        System.out.println("----------------------------------");

        // Exercice 2
        Dog dog = new Dog();
        dog.nom = "Rex";
        dog.aboyer("Je suis en colère. Ghhhhhhhhhh !!! WWWWOARF !! WWWWOARF !!");
        dog.manger("viande");

        Dog dog1 = new Dog();
        dog1.nom = "Max";
        dog1.aboyer("Je ne suis pas du tout en colère. Iwiw !! awaw !!");
        dog1.manger("poisson");
        System.out.println("----------------------------------");

        // Exercice 3
        Account account = new Account();
        account.nom = "El Alami Hassan";
        account.address = "Safi";
        account.solde = 14765.8f;
        account.printAccountInfos();

        Account account1 = new Account();
        account1.nom = "Karimi Khalid";
        account1.address = "Casablanca";
        account1.solde = 7654.0f;
        account1.printAccountInfos();
        System.out.println("----------------------------------");

        // Exercice 4
        Compte compte = new Compte();
        compte.solde = 14765.8f;
        compte.afficherInfosSolde();
        float tauxInteret = compte.calculateInteret(0.07f);
        System.out.println("Votre interét est : " + tauxInteret);
        System.out.println("----------------------------------");

        // Exercice 5
        Accounts accounts = new Accounts();
        accounts.setNom("Ahmed Ali");
        accounts.setAddress("Youssoufia");
        accounts.setSolde(2134.65f);
        System.out.println(accounts.getNom());
        System.out.println(accounts.getAddress());
        System.out.println(accounts.getSolde());
        System.out.println("----------------------------------");

        // Exercice 6
        float montantRetire = accounts.retirer(2000);
        System.out.println("Vous avez comme reste : " + montantRetire + " DH");





    }
}
