package radiocare.presentation;

import java.time.LocalDate;
import java.util.Scanner;

import radiocare.entities.Patient;

public class PatientUI {
    public static Patient saisirPatient() {
        System.out.println("========Saisie du nouveau patient========");
        Scanner sc = new Scanner(System.in);

        System.out.println("CIN:");
        int cin = sc.nextInt();
        sc.nextLine();

        System.out.println("Nom:");
        String nom = sc.nextLine(); 

        System.out.println("Prenom:");
        String prenom = sc.nextLine(); 

        System.out.println("Date de naissance:");
        System.out.println("Jour");
        int jour = sc.nextInt();
        sc.nextLine();

        System.out.println("Mois");
        int mois = sc.nextInt();
        sc.nextLine();

        System.out.println("Annee");
        int annee = sc.nextInt();
        sc.nextLine();

        LocalDate date = LocalDate.of(annee, mois, jour);

        System.out.println("Telephone");
        int telephone = sc.nextInt();
        sc.nextLine();

        System.out.println("Email:");
        String email = sc.nextLine(); 

        System.out.println("Numero d'assurance:");
        int numA = sc.nextInt();
        sc.nextLine();

        System.out.println("Solde du Compte:");
        double solde = sc.nextDouble();
        sc.nextLine();

        sc.close();
        Patient p = new Patient(cin, nom, prenom, date, telephone, email, numA, solde, null);
        return p;
    }
}
