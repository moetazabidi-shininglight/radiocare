package radiocare.services;

import radiocare.entities.ManipulateurRadio;
import radiocare.repositories.ManipulateurRadioDAO;

public class ManipulateurRadioService {
    private final ManipulateurRadioDAO dao;

    public ManipulateurRadioService(ManipulateurRadioDAO dao) {
        System.out.println("DAO reçu: "+dao);
        this.dao = dao;
    }
    public double CalculSalaireMensuel(ManipulateurRadio m, int heuresGardes, int actes) {
        return (heuresGardes)/720+actes;
    }

}
