package advanced.oop;

import com.company.*;

import java.time.LocalDate;
import java.time.Period;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        // Constructor
        Employee employee1 = new Employee("El alami", "Mohammad", "Casablanca", 1963, 2020);
        Employee employee2 = new Employee("El wahabi", "Khalid", "Safi", 1990, 2020);
        Employee employee3 = new Employee("Sbai", "Fouad", "Salé", 2006, 2020);

        Employee[] employees = {employee1, employee2, employee3};

        for (Employee employee: employees) {
            employee.afficherInfosClient();
            System.out.println("Votre age est: " + employee.calculateAge());
        }
        System.out.println("================================================");

        // Héritage


        // Exercice 1
        Article article = new Article("Alibaba", 230);
        System.out.println(article.afficher());

        ArticleEnSolde articleEnSolde = new ArticleEnSolde("Science Fiction", 400, 35);
        System.out.println(articleEnSolde.afficher());
        System.out.println("================================================");

        // Exercice 2
        BankAccount bankAccount = new BankAccount(1234567, 20000);
        System.out.println(bankAccount.ajouter(2000));
        System.out.println(bankAccount.retirer(25000));
        System.out.println(bankAccount.retirer(15000));
        System.out.println(bankAccount.afficher());

        System.out.println("===========================================");

        EpargneAccount epargneAccount = new EpargneAccount(45697544, 55500, 0.03f);
        System.out.println(epargneAccount.ajouter(2000));
        System.out.println(epargneAccount.retirer(25000));
        System.out.println(epargneAccount.retirer(100));
        System.out.println(epargneAccount.calculInteretAnnuel());
        System.out.println(epargneAccount.afficher());

        System.out.println("===========================================");


        // Exercice 3
        Secretaire secretaire = new Secretaire("Ali", "Ahmed", "123ABC","24/11/1993", "Casablanca", 23);
        System.out.println(secretaire.ecrirePersonne());

        Enseignant enseignant = new Enseignant("Kawtar", "Amin", "ABC123","01/05/1994", "Rabat", "Physique");
        System.out.println(enseignant.ecrirePersonne());

        Etudiant etudiant = new Etudiant("Kadouri", "Mustapha", "ABC123","05/01/1997", "Tiznit", "Informatique");
        System.out.println(etudiant.ecrirePersonne());

    }
}
