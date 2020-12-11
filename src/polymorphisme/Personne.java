package polymorphisme;

public class Personne {
    private String nom;
    private String prenom;
    private String addresse;
    private int dateNaissance;
    private String ville;


    public Personne(String nom, String prenom, String addresse, int dateNaissance, String ville) {
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

    public int getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(int dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String afficher() {
        return this.nom + " " + this.prenom + " - " + this.addresse + " - " + this.dateNaissance + " - " + this.ville;
    }
}
