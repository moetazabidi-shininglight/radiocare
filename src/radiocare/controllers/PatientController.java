package radiocare.controllers;
import radiocare.entities.Patient;
import radiocare.presentation.PatientUI;
import radiocare.repositories.PatientDAO;
import radiocare.services.PatientService;

public class PatientController {
    public PatientUI ui;
    public PatientService service;

    public PatientController(PatientUI ui, PatientService service) {
        this.ui = ui;
        this.service = service;
    }

    public static void init(){
        Patient p = PatientUI.saisirPatient();
        PatientDAO dao = new PatientDAO("patients.json");
        PatientService patientService = new PatientService(dao);
        patientService.creerPatient(p);

    }
    public void proprietes(Patient p) {
        PatientUI.PatientProprietes(p);
    }
    
}
