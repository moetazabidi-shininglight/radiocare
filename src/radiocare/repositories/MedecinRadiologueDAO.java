package radiocare.repositories;

import java.nio.file.Path;

public class MedecinRadiologueDAO {
    private Path fichier;
    public MedecinRadiologueDAO(String path) {
        this.fichier=Path.of(path);
    }
}
    
