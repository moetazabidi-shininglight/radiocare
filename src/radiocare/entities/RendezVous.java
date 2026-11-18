package radiocare.entities;

import java.time.LocalDate;

public class RendezVous {
    private String id_rdv;
    private LocalDate Date;
    private int heureDebut;
    private int DureeMin;
    private String id_patient;
    private String id_medecin;
    private String id_manip;
    private String id_salle;
    private String id_examen;
    private String statut;

    public RendezVous(String id_rdv, LocalDate Date, int heureDebut, int DureeMin, String id_patient, String id_medecin, String id_manip, String id_salle, String id_examen, String statut) {
        this.id_rdv = id_rdv;
        this.Date = Date;
        this.heureDebut = heureDebut;
        this.DureeMin = DureeMin;
        this.id_patient = id_patient;
        this.id_medecin = id_medecin;
        this.id_manip = id_manip;
        this.id_salle = id_salle;
        this.id_examen = id_examen;
        this.statut = statut;
    }

    public String getId_rdv() {
        return this.id_rdv;
    }

    public void setId_rdv(String id_rdv) {
        this.id_rdv = id_rdv;
    }

    public LocalDate getDate() {
        return this.Date;
    }

    public void setDate(LocalDate Date) {
        this.Date = Date;
    }

    public int getHeureDebut() {
        return this.heureDebut;
    }

    public void setHeureDebut(int heureDebut) {
        this.heureDebut = heureDebut;
    }

    public int getDureeMin() {
        return this.DureeMin;
    }

    public void setDureeMin(int DureeMin) {
        this.DureeMin = DureeMin;
    }

    public String getId_patient() {
        return this.id_patient;
    }

    public void setId_patient(String id_patient) {
        this.id_patient = id_patient;
    }

    public String getId_medecin() {
        return this.id_medecin;
    }

    public void setId_medecin(String id_medecin) {
        this.id_medecin = id_medecin;
    }

    public String getId_manip() {
        return this.id_manip;
    }

    public void setId_manip(String id_manip) {
        this.id_manip = id_manip;
    }

    public String getId_salle() {
        return this.id_salle;
    }

    public void setId_salle(String id_salle) {
        this.id_salle = id_salle;
    }

    public String getId_examen() {
        return this.id_examen;
    }

    public void setId_examen(String id_examen) {
        this.id_examen = id_examen;
    }

    public String getStatut() {
        return this.statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
    
}
