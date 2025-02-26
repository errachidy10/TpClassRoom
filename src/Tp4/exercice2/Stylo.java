package Tp4.exercice2;

public class Stylo  extends Article {
    String marque;
    String couleur;
    String prix_unitaire;


    @Override
    public String calculeReference() {
        return marque+":stylo:"+couleur;
    }

    @Override
    public String toString() {
        return "Stylo{" +
                "marque='" + marque + '\'' +
                ", couleur='" + couleur + '\'' +
                ", prix_unitaire='" + prix_unitaire + '\'' +
                '}';
    }
}
