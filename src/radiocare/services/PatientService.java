package radiocare.services;
import java.util.NoSuchElementException;

import radiocare.entities.*;
import radiocare.repositories.PatientDAO;

public class PatientService {
    private final PatientDAO dao;

    public PatientService(PatientDAO dao) {
        System.out.println("DAO reçu: "+dao);
        this.dao = dao;
    }
    public Patient consulter(String CIN) {
        return dao.trouverParId(CIN)
                .orElseThrow(() -> new NoSuchElementException("Patient introuvable : " + CIN));    
    }
    public void creerPatient(Patient p) {
        if (dao.trouverParId(p.getCin()).isPresent()) {
            throw new IllegalStateException("Un patient existe déjà avec ce CIN.");
        }
        dao.ajouter(p);
    }
    public void retirerPatient(String CIN) {
        consulter(CIN);
        dao.supprimer(CIN);
    }
    public void editerPatient(Patient p) {
        consulter(p.getCin());
        dao.modifier(p);
    }
    public void enregistrerPaiement(Patient p, double montant) {
        p.crediter(montant);
        editerPatient(p);
    }
    public void facturerExamen(Patient p, String id, double montant) {
        p.AjouterExamenID(id);
        p.debiter(montant);
        editerPatient(p);
    }
}
