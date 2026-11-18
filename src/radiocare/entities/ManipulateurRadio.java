package radiocare.entities;

import java.util.List;

public class ManipulateurRadio {
    private String id_manip;
    private String cin;
    private String nom;
    private String prenom;
    private String hebiliations; //irm, scanner, rayons x
    private double TarifHoraire;
    private final List<String> StatusDispo;

    public ManipulateurRadio(String id_manip, String cin, String nom, String prenom, String hebiliations, double TarifHoraire, List<String> StatusDispo) {
        this.id_manip = id_manip;
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.hebiliations = hebiliations;
        this.TarifHoraire = TarifHoraire;
        this.StatusDispo = StatusDispo;
    }

    public String getId_manip() {
        return this.id_manip;
    }

    public void setId_manip(String id_manip) {
        this.id_manip = id_manip;
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

    public String getHebiliations() {
        return this.hebiliations;
    }

    public void setHebiliations(String hebiliations) {
        this.hebiliations = hebiliations;
    }

    public double getTarifHoraire() {
        return this.TarifHoraire;
    }

    public void setTarifHoraire(double TarifHoraire) {
        this.TarifHoraire = TarifHoraire;
    }

    public List<String> getStatusDispo() {
        return this.StatusDispo;
    }
    
}
