package radiocare.repositories;

import java.nio.file.Path;

public class ManipulateurRadioDAO {
    private Path fichier;
    public ManipulateurRadioDAO(String path) {
        this.fichier=Path.of(path);
    }
}
