package radiocare.entities;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Patient {
    private String cin;
    private String nom;
    private String prenom;
    private LocalDate DateNaissance;
    private String Telephone;
    private String Email;
    private String NumAssurance;
    private double SoldeCompte;
    private final List<String> historiqueExamensIds;

    public Patient(String cin, String nom, String prenom, LocalDate DateNaissance, String Telephone, String Email, String NumAssurance, double SoldeCompte, String[] HistoriqueExamenIDs) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.DateNaissance = DateNaissance;
        this.Telephone = Telephone;
        this.Email = Email;
        this.NumAssurance = NumAssurance;
        this.SoldeCompte = SoldeCompte;
        this.historiqueExamensIds = new ArrayList<>();
    }

    public String getCin() {
        return this.cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDateNaissance() {
        return this.DateNaissance;
    }

    public void setDateNaissance(LocalDate DateNaissance) {
        this.DateNaissance = DateNaissance;
    }

    public String getTelephone() {
        return this.Telephone;
    }

    public void setTelephone(String Telephone) {
        this.Telephone = Telephone;
    }

    public String getEmail() {
        return this.Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNumAssurance() {
        return this.NumAssurance;
    }

    public void setNumAssurance(String NumAssurance) {
        this.NumAssurance = NumAssurance;
    }

    public double getSoldeCompte() {
        return this.SoldeCompte;
    }

    public void setSoldeCompte(double SoldeCompte) {
        this.SoldeCompte = SoldeCompte;
    }

    public void debiter(double montant) {
        if (SoldeCompte - montant > 0) {
            SoldeCompte-=montant;
        }
    }

    public void crediter(double solde) {
        if (SoldeCompte + solde > 0) {
            SoldeCompte+=solde;
        }
    }

    public void AjouterExamenID(String id) {
        historiqueExamensIds.add(Objects.requireNonNull(id));
    }
    public List<String> getHistoriqueExamensIds() {
        return this.historiqueExamensIds;
    }

}
