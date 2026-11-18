package radiocare.presentation;

import java.util.Scanner;

import radiocare.entities.ManipulateurRadio;

public class ManipulateurRadioUI {
    public static ManipulateurRadio saisirManipulateurRadio() {
        System.out.println("========Saisie du nouveau Manipulateur========");
        Scanner sc = new Scanner(System.in);

        System.out.println("CIN:");
        String cin = sc.nextLine();
        
        System.out.println("Nom:");
        String nom = sc.nextLine(); 

        System.out.println("Prenom:");
        String prenom = sc.nextLine();

        System.out.println("Habiliations (1- IRM, 2- SCanner, 3- Rayons X):");
        String habs = sc.nextLine();

        System.out.println("Horaire du tarif:");
        double horaireTarif = sc.nextDouble();
        sc.nextLine();
        //declaration de la liste StatusDispo

        sc.close();
        ManipulateurRadio m = new ManipulateurRadio(cin, cin, nom, prenom, habs, horaireTarif, null);
        System.out.println("=========================================");
        return m;
    }
    public static void ManipulateurRadioProprietes(ManipulateurRadio m) {
        System.out.println("==========Proprietes du manipulateur==========");
        System.out.println("> Nom: "+m.getNom());
        System.out.println("> Prenom: "+m.getPrenom());
        System.out.println("> CIN: "+m.getCin());
        System.out.println("> Specialité: "+m.getHebiliations());
        System.out.println("> Horaire du tarif: "+m.getTarifHoraire());
    }
}
