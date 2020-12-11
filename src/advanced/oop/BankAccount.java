package advanced.oop;

public class BankAccount {
    private long numeroCompte;
    private double solde;

    public BankAccount(long numeroCompte, double solde) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
    }

    public long getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(long numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public double ajouter(double montant) {
        this.solde += montant;
        return this.solde;
    }

    public double retirer(double montant) {
        if (montant > this.solde) {
            System.out.println("Le montant demandé est plus grande du montant.");
        } else {
            this.solde -= montant;
        }
        return this.solde;
    }

    public String afficher() {
        return "Le solde de cette compte " + this.numeroCompte + " est : " + this.solde + " DH.";
    }
}
