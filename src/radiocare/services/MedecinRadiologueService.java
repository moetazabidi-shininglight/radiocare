package radiocare.services;

import radiocare.entities.MedecinRadiologue;
import radiocare.repositories.MedecinRadiologueDAO;

public class MedecinRadiologueService {
    private final MedecinRadiologueDAO dao;

    public MedecinRadiologueService(MedecinRadiologueDAO dao) {
        System.out.println("DAO reçu: "+dao);
        this.dao = dao;
    }
    public double CalculHonoraires(MedecinRadiologue medecin, int actes) {
        return medecin.getTrafiPourcentageActe()*actes;
    }
}
