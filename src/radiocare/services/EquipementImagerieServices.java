package radiocare.services;

import radiocare.entities.EquipementImagerie;
import radiocare.repositories.EquipementImagerieDAO;

public class EquipementImagerieServices {
    private final EquipementImagerieDAO dao;

    public EquipementImagerieServices(EquipementImagerieDAO dao) {
        System.out.println("DAO reçu: "+dao);
        this.dao = dao;
    }

    public String verifierAlerteMaintenance(EquipementImagerie eq) {
        double heuresRestantes = eq.getHeuresRestantesMaintenance();
        if (heuresRestantes <= 0) {
            return "L'équipement a dépassé sa limite d'entretien !";
        } else if (heuresRestantes <= 50) {
            return "Maintenance préventive bientôt requise (" + heuresRestantes + "h restantes).";
        } else {
            return "État normal (Heures restantes avant maintenance : " + heuresRestantes + "h).";
        }
}
}
