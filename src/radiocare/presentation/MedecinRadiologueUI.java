package radiocare.presentation;
import java.util.Scanner;

import radiocare.entities.MedecinRadiologue;

public class MedecinRadiologueUI {
    public static MedecinRadiologue saisirMedecinRadiologue() {
        System.out.println("========Saisie du nouveau medecin========");
        Scanner sc = new Scanner(System.in);

        System.out.println("CIN:");
        String cin = sc.nextLine();
        
        System.out.println("Nom:");
        String nom = sc.nextLine(); 

        System.out.println("Prenom:");
        String prenom = sc.nextLine();

        System.out.println("Specialité (1- Neuroradiologie, 2- Ostéo, 3- Thoracique):");
        String spec = sc.nextLine();

        System.out.println("TarifPourcentageActe:");
        double tarif = sc.nextDouble();
        sc.nextLine();

        sc.close();
        MedecinRadiologue p = new MedecinRadiologue(cin, cin, nom, prenom, spec, tarif, null);
        System.out.println("=========================================");
        return p;
    }
    public static void MedecinRadiologueProprietes(MedecinRadiologue m) {
        System.out.println("==========Proprietes du medecin==========");
        System.out.println("> Nom: "+m.getNom());
        System.out.println("> Prenom: "+m.getPrenom());
        System.out.println("> CIN: "+m.getCin());
        System.out.println("> Specialité: "+m.getSpec());
        System.out.println("> TarifPourcentageActe: "+m.getTrafiPourcentageActe()+" %");
    }
    }
