package radiocare.services;
import radiocare.entities.*;
import radiocare.repositories.PatientDAO;

public class PatientService {
    private PatientDAO dao = new PatientDAO();
    public PatientService(PatientDAO dao) {
        this.dao = dao;
    }
    //public Patient consulter(String CIN) {
        
    //}
    public void creerPatient() {

    }
    public void enregistrerPaiement(Patient p, double montant) {
        p.crediter(montant);
        //pDAO.save(p);
    }
    public void facturerExamen(Patient p, String id, double montant) {
        p.AjouterExamenID(id);
        p.debiter(montant);
        //pDAO.save(p);
    }
}
