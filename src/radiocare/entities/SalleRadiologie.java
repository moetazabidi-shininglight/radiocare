package radiocare.entities;

import java.util.List;

public class SalleRadiologie {
    private String id_salle;
    private String nom;
    private int numEtage;
    private String typeSalle;
    private String EquipAttribueID;
    private String NormeBlindagePlomb;
    private final List<String> historiqueExamensIds;

    public SalleRadiologie(String id_salle, String nom, int numEtage, String typeSalle, String EquipAttribueID, String NormeBlindagePlomb, List<String> historiqueExamensIds) {
        this.id_salle = id_salle;
        this.nom = nom;
        this.numEtage = numEtage;
        this.typeSalle = typeSalle;
        this.EquipAttribueID = EquipAttribueID;
        this.NormeBlindagePlomb = NormeBlindagePlomb;
        this.historiqueExamensIds = historiqueExamensIds;
    }

    public String getId_salle() {
        return this.id_salle;
    }

    public void setId_salle(String id_salle) {
        this.id_salle = id_salle;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumEtage() {
        return this.numEtage;
    }

    public void setNumEtage(int numEtage) {
        this.numEtage = numEtage;
    }

    public String getTypeSalle() {
        return this.typeSalle;
    }

    public void setTypeSalle(String typeSalle) {
        this.typeSalle = typeSalle;
    }

    public String getEquipAttribueID() {
        return this.EquipAttribueID;
    }

    public void setEquipAttribueID(String EquipAttribueID) {
        this.EquipAttribueID = EquipAttribueID;
    }

    public String getNormeBlindagePlomb() {
        return this.NormeBlindagePlomb;
    }

    public void setNormeBlindagePlomb(String NormeBlindagePlomb) {
        this.NormeBlindagePlomb = NormeBlindagePlomb;
    }

    public List<String> getHistoriqueExamensIds() {
        return this.historiqueExamensIds;
    }
    
}
