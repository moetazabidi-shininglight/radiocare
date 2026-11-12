package radiocare.repositories;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import radiocare.entities.Patient;

public class PatientDAO {

    private Path fichier;
    private final Map<String, Patient> stockage = new LinkedHashMap<>();

    public void ajouter(Patient patient) {
        stockage.put(patient.getCin(), patient);
        sauvegarder();
    }
    public PatientDAO(String FilePath) {
        this.fichier = Path.of(FilePath);
        charger();
        System.out.println(fichier);
    }

    public Optional<Patient> trouverParId(String cin) {
        return Optional.ofNullable(stockage.get(cin));
    }

    public List<Patient> trouverTous() {
        return new ArrayList<>(stockage.values());
    }

    public void modifier(Patient patient) {
        stockage.put(patient.getCin(), patient);
        sauvegarder();
    }

    public void supprimer(String cinMatricule) {
        stockage.remove(cinMatricule);
        charger();
        sauvegarder();
    }
    private void charger() {
        
    }

    private void sauvegarder() {
        
    }
}