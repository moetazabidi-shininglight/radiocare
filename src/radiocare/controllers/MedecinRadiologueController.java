package radiocare.controllers;

import radiocare.entities.MedecinRadiologue;
import radiocare.presentation.MedecinRadiologueUI;
import radiocare.repositories.MedecinRadiologueDAO;
import radiocare.services.MedecinRadiologueService;

public class MedecinRadiologueController {
    public MedecinRadiologueUI ui;
    public MedecinRadiologueService service;

    public MedecinRadiologueController(MedecinRadiologueUI ui, MedecinRadiologueService service) {
        this.ui = ui;
        this.service = service;
    }

    public static void init(){
        MedecinRadiologue m = MedecinRadiologueUI.saisirMedecinRadiologue();
        MedecinRadiologueDAO dao = new MedecinRadiologueDAO("manipulateurradio.json");
        MedecinRadiologueService service = new MedecinRadiologueService(dao);

    }
    public void proprietes(MedecinRadiologue m) {
        MedecinRadiologueUI.MedecinRadiologueProprietes(m);
    }
}
