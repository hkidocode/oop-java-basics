package polymorphisme;

public class Directeur extends Chef {
    private String societe;

    public Directeur(String nom, String prenom, String addresse, int dateNaissance, String ville, float salaire, String service, String societe) {
        super(nom, prenom, addresse, dateNaissance, ville, salaire, service);
        this.societe = societe;
    }

    public String getSociete() {
        return societe;
    }

    public void setSociete(String societe) {
        this.societe = societe;
    }

    public String afficher() {
        return super.afficher() + " - " + this.getSalaire() + " - " + this.getService() + " - " + this.societe;
    }
}