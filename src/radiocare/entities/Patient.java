package radiocare.entities;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Patient {
    private String cin;
    private String nom;
    private String prenom;
    private LocalDate DateNaissance;
    private String Telephone;
    private String Email;
    private String NumAssurance;
    private double SoldeCompte;
    private List<String> historiqueExamensIds;

    public Patient() {
        this.historiqueExamensIds = null;
    }

    public Patient(String cin, String nom, String prenom, LocalDate DateNaissance, String Telephone, String Email, String NumAssurance, double SoldeCompte, String[] HistoriqueExamenIDs) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.DateNaissance = DateNaissance;
        this.Telephone = Telephone;
        this.Email = Email;
        this.NumAssurance = NumAssurance;
        this.SoldeCompte = SoldeCompte;
        this.historiqueExamensIds = new ArrayList<String>();
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

    public void setHistoriqueExamenID(List<String> examen_ids) {
        this.historiqueExamensIds = null;
        for (String id : examen_ids) {
            this.historiqueExamensIds.add(id);
        }
    }
    public List<String> getHistoriqueExamensIds() {
        return this.historiqueExamensIds;
    }
    
    public JSONObject toJson() throws JSONException{
        JSONObject o =new JSONObject();
        o.put("CIN:", cin);
        o.put("Nom:", nom);
        o.put("Prenom:", prenom);
        o.put("DateNaissance:", DateNaissance);
        o.put("Telephone:", Telephone);
        o.put("Email:", Email);
        o.put("NumAsurance:", NumAssurance);
        o.put("SoldeCompte:", SoldeCompte);
        JSONArray examens = new JSONArray();
        for (String id : historiqueExamensIds) {
            examens.put(id);
        }
        o.put("HistoriqueExamensIds:", examens);
        return o;
    }
    public static Patient fromJson(JSONObject o) throws JSONException{
        Patient p = new Patient();
        p.setCin(o.getString("CIN:"));
        p.setNom(o.getString("Nom:"));
        p.setPrenom(o.getString("Prenom:"));
        p.setDateNaissance((LocalDate)o.get("DateNaissance:"));
        p.setTelephone(o.getString("Telephone:"));
        p.setEmail(o.getString("Email:"));
        p.setNumAssurance(o.getString("NumAssurance:"));
        p.setSoldeCompte(o.getDouble("SoldeCompte:"));
        p.setHistoriqueExamenID((List<String>)o.get("HistoriqueExamensIds:"));
        return p;
}
}
