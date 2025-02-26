package Tp3;

import java.util.Objects;
import java.util.Scanner;

public class BoiteALettres {



    public ObjectPostale lire(Scanner sc,String choix_colis_lettre){
        ObjectPostale resultat;
        System.out.println("Veuillez entrer votre nom destinataire: ");
        String nom_destnatiaire = sc.nextLine();
        System.out.println("Veuillez entrer l'adresse du destinataire: ");
        String adresse_destinataire = sc.nextLine();
        System.out.println("Veuillez entrer code postal: ");
        int code_postal = sc.nextInt();
        sc.nextLine();
        System.out.println("Veuillez entrer ville  destination: ");
        String ville_destinataire = sc.nextLine();
        System.out.println("si expidé en recommande entrez true sinon false:");
        boolean expider_en_recommande = sc.nextBoolean();


        if(Objects.equals(choix_colis_lettre, "colis")){

            System.out.println("Veuillez entrer poids: ");
            double poid = sc.nextDouble();
            sc.nextLine();
            resultat = new Colis(nom_destnatiaire,adresse_destinataire,code_postal,ville_destinataire,expider_en_recommande,poid);
        }
        else {
            System.out.println("si expidé en urgence entre true sin false:");
            boolean expider_en_urgence = sc.nextBoolean();
            resultat = new Lettre(nom_destnatiaire, adresse_destinataire, code_postal, ville_destinataire,expider_en_recommande,expider_en_urgence);
        }
        return  resultat;
    }
}
