package polymorphisme;

import java.util.ArrayList;
import java.util.HashSet;

public class Ouvrage {
    private String titre;
    private String dateCreation;
    private boolean isExist;

    public Ouvrage() { }

    public Ouvrage(String titre, String dateCreation, boolean isExist) {
        this.titre = titre;
        this.dateCreation = dateCreation;
        this.isExist = isExist;
    }


    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public boolean getIsExist() {
        return isExist;
    }

    public void setIsExist(boolean isExist) {
        this.isExist = isExist;
    }

    public String afficher() {
        return this.titre + " - " + this.dateCreation + " - " + this.isExist;
    }

}
