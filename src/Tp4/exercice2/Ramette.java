package Tp4.exercice2;

public class Ramette extends Article {

    String marque;
    String grammage;
    String couleur;
    String prix_unitaire;

    @Override
    public String calculeReference() {
        return marque+":ramette:"+grammage + ":"+couleur;
    }

    @Override
    public String toString() {
        return "Ramette{" +
                "marque='" + marque + '\'' +
                ", grammage='" + grammage + '\'' +
                ", couleur='" + couleur + '\'' +
                ", prix_unitaire='" + prix_unitaire + '\'' +
                '}';
    }
}
