import radiocare.controllers.PatientController;
import radiocare.entities.Patient;
import radiocare.presentation.PatientUI;
import radiocare.repositories.PatientDAO;
import radiocare.services.PatientService;

public class Main {
    public static void main(String[] args) {
        PatientDAO dao = new PatientDAO("patients.json");
        PatientService ps = new PatientService(dao);
        PatientUI ui = new PatientUI();
        PatientController p = new PatientController(ui, ps);
        p.init();
    }
}
