package polymorphisme;

public class Chef extends Employee {
    private String service;

    public Chef(String nom, String prenom, String addresse, int dateNaissance, String ville, float salaire, String service) {
        super(nom, prenom, addresse, dateNaissance, ville, salaire);
        this.service = service;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String afficher() {
        return super.afficher() + " - " + this.getSalaire() + " - " + this.service;
    }
}
