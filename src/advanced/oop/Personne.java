package advanced.oop;

public abstract class Personne {
    private String nom;
    private String prenom;
    private String addresse;
    private String dateNaissance;
    private String ville;


    public Personne(String nom, String prenom, String addresse, String dateNaissance, String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.addresse = addresse;
        this.dateNaissance = dateNaissance;
        this.ville = ville;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String toString() {
        return this.getNom() + " " + this.getPrenom() + " - " + this.getAddresse() + " - " + this.getDateNaissance() + " - " + this.getVille();
    }

    public void modifiePersonne(String addresse, String ville) {
        this.setAddresse(addresse);
        this.setVille(ville);
    }

    public abstract String ecrirePersonne();
}
