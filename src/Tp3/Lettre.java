package Tp3;

public class Lettre extends  ObjectPostale{
    public boolean lettreExpidation_en_urgence;

    public Lettre(String nom_destinataire, String adresse_destinataire, int postal, String ville_destination, boolean expidié_en_recommande,boolean lettreExpidation) {
        super(nom_destinataire, adresse_destinataire, postal, ville_destination, expidié_en_recommande);
    this.lettreExpidation_en_urgence = lettreExpidation;
    }

    double prix() {
        if(expidié_en_recommande) return 15 + 5;
        else if(lettreExpidation_en_urgence) return  6 + 5;
        else return 5;
    }

    @Override
    public String toString() {
        if(lettreExpidation_en_urgence)
        return super.toString()+"lettre urgence existe";
        else return super.toString()+"lettre en recommande";
    }
}
