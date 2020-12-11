package polymorphisme;

import java.util.ArrayList;

public class Bibliotheque extends Ouvrage {

    private ArrayList<Ouvrage> ouvrages;
    private ArrayList<Abonne> abonnes;

    public Bibliotheque(ArrayList<Ouvrage> ouvrages, ArrayList<Abonne> abonnes) {
        this.ouvrages = ouvrages;
        this.abonnes = abonnes;
    }

    public void ajoutOuvrage(Ouvrage ouvrage) {
        for (int i = 0; i < this.ouvrages.size(); i++) {
            if (ouvrages.get(i).getTitre() != ouvrage.getTitre()) {
                this.ouvrages.add(ouvrage);
            }
        }
    }

    public Ouvrage getOuvrage(String titre) {
        Ouvrage result = null;
        for (int i = 0; i < this.ouvrages.size(); i++) {
            if (this.ouvrages.get(i).getTitre() == titre) {
                result = this.ouvrages.get(i);
                break;
            }
        }
        return result;
    }

    public void ajoutAbonne(Abonne abonne) {
        for (int i = 0; i < this.abonnes.size(); i++) {
            if(this.abonnes.get(i).getId() != abonne.getId()) {
                this.abonnes.add(abonne);
            } else {
                this.abonnes.remove(abonne);
            }
        }
    }

    public Abonne getAbonne(int id) {
        Abonne result = null;
        for (int i = 0; i < this.abonnes.size(); i++) {
            if (this.abonnes.get(i).getId() == this.abonnes.get(id).getId()) {
                result = this.abonnes.get(i);
                break;
            }
        }
        return result;
    }

}
