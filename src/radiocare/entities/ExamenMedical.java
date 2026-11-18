package radiocare.entities;

public class ExamenMedical {
    private String id_exam;
    private String CodeActe;
    private String libelle;
    private int dureeEstimeMinutes;
    private double TarifHT;

    public ExamenMedical(String id_exam, String CodeActe, String libelle, int dureeEstimeMinutes, double TarifHT) {
        this.id_exam = id_exam;
        this.CodeActe = CodeActe;
        this.libelle = libelle;
        this.dureeEstimeMinutes = dureeEstimeMinutes;
        this.TarifHT = TarifHT;
    }

    public String getId_exam() {
        return this.id_exam;
    }

    public void setId_exam(String id_exam) {
        this.id_exam = id_exam;
    }

    public String getCodeActe() {
        return this.CodeActe;
    }

    public void setCodeActe(String CodeActe) {
        this.CodeActe = CodeActe;
    }

    public String getLibelle() {
        return this.libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getDureeEstimeMinutes() {
        return this.dureeEstimeMinutes;
    }

    public void setDureeEstimeMinutes(int dureeEstimeMinutes) {
        this.dureeEstimeMinutes = dureeEstimeMinutes;
    }

    public double getTarifHT() {
        return this.TarifHT;
    }

    public void setTarifHT(double TarifHT) {
        this.TarifHT = TarifHT;
    }
    
}
