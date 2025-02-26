package Tp3;

public class Colis extends ObjectPostale{


    public Colis(String nom_destinataire, String adresse_destinataire, int postal, String ville_destination, boolean expidié_en_recommande, double poid) {
        super(nom_destinataire, adresse_destinataire, postal, ville_destination, expidié_en_recommande);
        this.poid = poid;
    }

    public double poid ;

    public Colis(String nom_destinataire, String adresse_destinataire, int postal, String ville_destination, boolean expidié_en_recommande) {
        super(nom_destinataire, adresse_destinataire, postal, ville_destination, expidié_en_recommande);
        this.poid = poid;
    }


    @Override
    double prix() {
        double prixAffranchisement = 0.08*poid;
        if(expidié_en_recommande) return prixAffranchisement + 3;
        else return prixAffranchisement;
    }

    @Override
    public String toString() {
        return super.toString()+"Colis{" + "poid=" + poid/1000 +"kg" +'}';
    }
}
