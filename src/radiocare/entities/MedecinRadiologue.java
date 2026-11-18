package radiocare.entities;

import java.util.List;

public class MedecinRadiologue {
    private String id_medecin;
    private String cin;
    private String nom;
    private String prenom;
    private String spec; //neuro, osteo, thorac
    private double TrafiPourcentageActe;
    private final List<String> DispoPlanning;

    public MedecinRadiologue(String id_medecin, String cin, String nom, String prenom, String spec, double TrafiPourcentageActe, List<String> DispoPlanning) {
        this.id_medecin = id_medecin;
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.spec = spec;
        this.TrafiPourcentageActe = TrafiPourcentageActe;
        this.DispoPlanning = DispoPlanning;
    }

    public String getId_medecin() {
        return this.id_medecin;
    }

    public void setId_medecin(String id_medecin) {
        this.id_medecin = id_medecin;
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

    public String getSpec() {
        return this.spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public double getTrafiPourcentageActe() {
        return this.TrafiPourcentageActe;
    }

    public void setTrafiPourcentageActe(double TrafiPourcentageActe) {
        this.TrafiPourcentageActe = TrafiPourcentageActe;
    }

    public List<String> getDispoPlanning() {
        return this.DispoPlanning;
    }


    public MedecinRadiologue id_medecin(String id_medecin) {
        setId_medecin(id_medecin);
        return this;
    }

    public MedecinRadiologue cin(String cin) {
        setCin(cin);
        return this;
    }

    public MedecinRadiologue nom(String nom) {
        setNom(nom);
        return this;
    }

    public MedecinRadiologue prenom(String prenom) {
        setPrenom(prenom);
        return this;
    }

    public MedecinRadiologue spec(String spec) {
        setSpec(spec);
        return this;
    }

    public MedecinRadiologue TrafiPourcentageActe(double TrafiPourcentageActe) {
        setTrafiPourcentageActe(TrafiPourcentageActe);
        return this;
    }
}
