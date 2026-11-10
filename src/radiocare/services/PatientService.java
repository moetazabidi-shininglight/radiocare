package radiocare.services;
import radiocare.entities.*;
import radiocare.repositories.PatientDAO;

public class PatientService {
    private PatientDAO pDAO = new PatientDAO();
    public void enregistrerPaiement(Patient p, double montant) {
        p.crediter(montant);
        pDAO.save(p);
    }
    public void facturerExamen(Patient p, String id, double montant) {
        p.AjouterExamenID(id);
        p.debiter(montant);
        pDAO.save(p);
    }
}
