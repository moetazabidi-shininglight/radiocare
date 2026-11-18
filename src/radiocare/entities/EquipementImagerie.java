package radiocare.entities;

public class EquipementImagerie {
    private String id_equip;
    private String type;
    private String marque;
    private int heuresCumulees;
    private int heuresRestantesMaintenance;
    private String statut;

    public EquipementImagerie() {
    }

    public EquipementImagerie(String id_equip, String type, String marque, int heuresCumulees, int heuresRestantesMaintenance, String statut) {
        this.id_equip = id_equip;
        this.type = type;
        this.marque = marque;
        this.heuresCumulees = heuresCumulees;
        this.heuresRestantesMaintenance = heuresRestantesMaintenance;
        this.statut = statut;
    }

    public String getId_equip() {
        return this.id_equip;
    }

    public void setId_equip(String id_equip) {
        this.id_equip = id_equip;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMarque() {
        return this.marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getHeuresCumulees() {
        return this.heuresCumulees;
    }

    public void setHeuresCumulees(int heuresCumulees) {
        this.heuresCumulees = heuresCumulees;
    }

    public int getHeuresRestantesMaintenance() {
        return this.heuresRestantesMaintenance;
    }

    public void setHeuresRestantesMaintenance(int heuresRestantesMaintenance) {
        this.heuresRestantesMaintenance = heuresRestantesMaintenance;
    }

    public String getStatut() {
        return this.statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
    
}
