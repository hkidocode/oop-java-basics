package advanced.oop;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;

public class EpargneAccount extends BankAccount {

    private int minSolde = 200;
    private float interetAnnuel;

    public EpargneAccount(long numeroCompte, double solde, float interetAnnuel) {
        super(numeroCompte, solde);
        this.setInteretAnnuel(interetAnnuel);
    }

    public float getInteretAnnuel() {
        return interetAnnuel;
    }

    public void setInteretAnnuel(float interetAnnuel) {
        this.interetAnnuel = interetAnnuel;
    }

    public double retirer(double montant) {
        if (montant > this.minSolde) {
            System.out.println("La valeur minimale du solde à retirer est " + this.minSolde + " DH");
        } else {
            this.setSolde(this.getSolde() - montant);
        }
        return this.getSolde();
    }

    public double calculInteretAnnuel() {
        long monthsBetween = ChronoUnit.MONTHS.between(
                YearMonth.from(LocalDate.parse("2020-11-12")),
                YearMonth.from(LocalDate.parse("2020-12-31"))
        );
        return this.getSolde() * (this.interetAnnuel / 12) / monthsBetween;
    }
}
