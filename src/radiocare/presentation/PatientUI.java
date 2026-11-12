package radiocare.presentation;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import radiocare.entities.Patient;

public class PatientUI {
    public static Patient saisirPatient() {
        System.out.println("========Saisie du nouveau patient========");
        Scanner sc = new Scanner(System.in);

        System.out.println("CIN:");
        String cin = sc.nextLine();
        
        System.out.println("Nom:");
        String nom = sc.nextLine(); 

        System.out.println("Prenom:");
        String prenom = sc.nextLine(); 

        System.out.println("Date de naissance:");
        System.out.println("Jour:");
        int jour = sc.nextInt();
        sc.nextLine();

        System.out.println("Mois:");
        int mois = sc.nextInt();
        sc.nextLine();

        System.out.println("Annee:");
        int annee = sc.nextInt();
        sc.nextLine();

        LocalDate date = LocalDate.of(annee, mois, jour);

        System.out.println("Telephone:");
        String telephone = sc.nextLine();

        System.out.println("Email:");
        String email = sc.nextLine(); 

        System.out.println("Numero d'assurance:");
        String numA = sc.nextLine();

        System.out.println("Solde du Compte:");
        double solde = sc.nextDouble();
        sc.nextLine();

        sc.close();
        Patient p = new Patient(cin, nom, prenom, date, telephone, email, numA, solde, null);
        System.out.println("=========================================");
        return p;
    }
    public static void PatientProprietes(Patient p) {
        System.out.println("==========Proprietes du patient==========");
        System.out.println("> Nom: "+p.getNom());
        System.out.println("> Prenom: "+p.getPrenom());
        System.out.println("> CIN: "+p.getCin());
        System.out.println("> Date de Naissance: "+p.getDateNaissance());
        System.out.println("> Email: "+p.getEmail());
        System.out.println("> Telephone: "+p.getTelephone());
        System.out.println("> N° Assurance: "+p.getNumAssurance());
        System.out.println("> Solde: "+p.getSoldeCompte()+" £");
    }
    
}
