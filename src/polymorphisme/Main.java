package polymorphisme;

import advanced.oop.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Polymorphisme

        // Exercice 1
        Employee e1 = new Employee("Bounaga", "Abderrahim","test1", 1998, "Agadir", 5000);
        Employee e2 = new Employee("Hamid", "Abderrahim","test2", 1990, "Casablanca", 6000);
        Employee e3 = new Employee("Mohamed", "Ali","test3", 1992, "Rabat", 10000);
        Employee e4 = new Employee("Kawtar", "Houcine","test4", 1994, "Agadir", 4000);
        Employee e5 = new Employee("Asma", "Karim","test5", 1989, "Dakhla", 4500);

        Chef c1 = new Chef("Bounaga", "Abderrahim","test1", 1998, "Agadir", 5300, "Manager");
        Chef c2 = new Chef("Mohamed", "Ali","test3", 1992, "Rabat", 9000, "Developer");

        Directeur d1 = new Directeur("Kawtar", "Houcine","test4", 1994, "Agadir", 7000, "Chief de project", "OCP");

        Personne[] personnes = {e1, e2, e3, e4, e5, c1, c2, d1};

        for (Personne personne: personnes) {
            System.out.println(personne.afficher());
        }

        System.out.println("======================================================");

        // Exercice 2
        Livre l1 = new Livre("Introduction to C", "08/1980", true, "Karim Karim");
        Livre l2 = new Livre("Introduction to Python", "08/1980", false, "Ahmed Ahmed");
        Livre l3 = new Livre("Introduction to Java", "08/1980", true, "Ali Ali");
        ArrayList<Ouvrage> livres = new ArrayList<>();
        livres.add(l1);
        livres.add(l2);
        livres.add(l3);
        for (Ouvrage livre : livres) {
            System.out.println(livre.afficher());
        }

        System.out.println("======================================================");

        Video v1 = new Video("Python from beginner to advanced", "11/2017", true, "Khalid Khalid", 30);
        Video v2 = new Video("PHP from beginner to advanced", "11/2017", true, "Abderrahim Abderrahim", 23);
        Video v3 = new Video("Swift from beginner to advanced", "11/2017", false, "Ahmde Ahmde", 28);
        ArrayList<Ouvrage> videos = new ArrayList<>();
        videos.add(v1);
        videos.add(v2);
        videos.add(v3);
        for (Ouvrage video : videos) {
            System.out.println(video.afficher());
        }

        System.out.println("======================================================");

        Abonne ab1 = new Abonne(378454, "Youssef Amin", 8369, v1);
        Abonne ab2 = new Abonne(396454, "Imad Mohamed", 169, v2);
        Abonne ab3 = new Abonne(372154, "Hamid Anas", 2069, l1);

        ArrayList<Abonne> abonnes = new ArrayList<>();
        abonnes.add(ab1);
        abonnes.add(ab2);
        abonnes.add(ab3);
        for (Abonne abonne : abonnes) {
            System.out.println(abonne.afficher());
        }

        System.out.println("======================================================");

        Bibliotheque b1 = new Bibliotheque(videos, abonnes);
        Video v4 = new Video("HTML and CSS from beginner to advanced", "04/2019", true, "Amal Karim", 35);
        b1.ajoutOuvrage(v4);
        System.out.println(b1.getOuvrage("HTML and CSS from beginner to advanced").getIsExist());
        Abonne ab4 = new Abonne(145994, "Asma Mohamed", 3369, v4);
        b1.ajoutAbonne(ab4);
        for (Abonne abonne: abonnes) {
            System.out.println(abonne.afficher());
        }


    }
}
