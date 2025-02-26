package Tp3;

public abstract class ObjectPostale {
    public String nom_destinataire;
    public String adresse_destinataire;
    public int postal;
    public String ville_destination;
    public boolean expidié_en_recommande;



    public ObjectPostale(String nom_destinataire, String adresse_destinataire, int postal, String ville_destination, boolean expidié_en_recommande) {
        this.nom_destinataire = nom_destinataire;
        this.adresse_destinataire = adresse_destinataire;
        this.postal = postal;
        this.ville_destination = ville_destination;
        this.expidié_en_recommande = expidié_en_recommande;
    }

    abstract double prix();

    @Override
    public String toString() {
        return "ObjectPostale{" +
                "nom_destinataire='" + nom_destinataire + '\'' +
                ", adresse_destinataire='" + adresse_destinataire + '\'' +
                ", postal=" + postal +
                ", ville_destination='" + ville_destination + '\'' +
                ", expidié_en_recommande=" + expidié_en_recommande +
                '}';
    }

}
