package advanced.oop;

public class ArticleEnSolde extends Article{
    private float reduction;

    public ArticleEnSolde(String nom, int prix, float reduction) {
        super(nom, prix);
        this.reduction = reduction;
    }

    public void setReduction(float reduction) {
        this.reduction = reduction;
    }

    public float getReduction() {
        return reduction;
    }

    public String afficher() {
        return super.afficher() + " Mais avec réduction de " + this.reduction + "%, le prix devient " + ((this.getPrix() * this.reduction) / 100) + " DH";
    }
}
