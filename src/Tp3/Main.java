package Tp3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BoiteALettres test = new BoiteALettres();
        ObjectPostale colis = test.lire(sc,"colis");
        System.out.println(colis);
        System.out.println("le prix est :" +colis.prix());

        System.out.println("jenkins for testing ") ;
        System.out.println("jenkins for testing 2 ") ;
        ObjectPostale lettre = test.lire(sc,"lettre");
        System.out.println(lettre);
        System.out.println("le prix est :" +lettre.prix());

        sc.close();

    }
}
