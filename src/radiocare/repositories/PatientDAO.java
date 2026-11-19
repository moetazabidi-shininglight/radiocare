package radiocare.repositories;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import radiocare.entities.Patient;

public class PatientDAO {

    private Path fichier;
    private List<Patient> patients = new ArrayList<>();

    public void ajouterPatient(Patient patient) {
        patients.add(patient);
        sauvegarder();
    }
    public PatientDAO(String FilePath) throws JSONException {
        this.fichier = Path.of(FilePath);
        charger();
        System.out.println(fichier);
    }
    public Patient rechercherPatient(String cin) {
        for (int i=0; i<patients.size(); i++) {
            if (patients.get(i).getCin().equals(cin)) return patients.get(i);
        }
        return patients.get(patients.size()-1);
    }
    public void modifierPatient(Patient patient) {
        for (int i=0; i<patients.size(); i++) {
            if (patients.get(i).getCin().equals(patient.getCin())) patients.set(i, patient); 
        }
        sauvegarder();
    }

    public void supprimerPatient(String cin) throws JSONException{
        for (int i=0; i<patients.size(); i++) {
            if (patients.get(i).getCin().equals(cin)) patients.remove(i);
        }
        charger();
        sauvegarder();
    }
    private void charger() throws JSONException{
        patients.clear();
        try {
            if (!Files.exists(fichier)) return;
            String contenu = Files.readString(fichier).trim();
            if (contenu.isEmpty()) return;

            JSONArray array = new JSONArray(contenu);
            for (int i = 0; i < array.length(); i++) {
                patients.add(Patient.fromJson(array.getJSONObject(i)));
            }
        } catch (IOException e) {
            System.err.println("Read error: " + e.getMessage());
        }
    }

    private void sauvegarder() {
        
    }
}