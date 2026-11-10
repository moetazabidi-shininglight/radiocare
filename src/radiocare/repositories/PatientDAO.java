package radiocare.repositories;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import radiocare.entities.Patient;

public class PatientDAO {

    private final Map<String, Patient> stockage = new LinkedHashMap<>();

    public void ajouter(Patient patient) {
        stockage.put(patient.getCin(), patient);
    }

    public Optional<Patient> trouverParId(String cin) {
        return Optional.ofNullable(stockage.get(cin));
    }

    public List<Patient> trouverTous() {
        return new ArrayList<>(stockage.values());
    }

    public void modifier(Patient patient) {
        stockage.put(patient.getCin(), patient);
    }

    public void supprimer(String cin) {
        stockage.remove(cin);
    }
}