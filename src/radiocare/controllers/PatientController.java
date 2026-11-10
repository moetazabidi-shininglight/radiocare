package radiocare.controllers;
import radiocare.entities.Patient;
import radiocare.presentation.PatientUI;

public class PatientController {
    public void init(){
        Patient p = PatientUI.saisirPatient();
    }
    public void proprietes(Patient p) {
        PatientUI.PatientProprietes(p);
    }
    
}
