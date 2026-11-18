package radiocare.controllers;

import radiocare.entities.ManipulateurRadio;
import radiocare.presentation.ManipulateurRadioUI;
import radiocare.repositories.ManipulateurRadioDAO;
import radiocare.services.ManipulateurRadioService;

public class ManipulateurRadioController {
    public ManipulateurRadioUI ui;
    public ManipulateurRadioService service;

    public ManipulateurRadioController(ManipulateurRadioUI ui, ManipulateurRadioService service) {
        this.ui = ui;
        this.service = service;
    }

    public static void init(){
        ManipulateurRadio m = ManipulateurRadioUI.saisirManipulateurRadio();
        ManipulateurRadioDAO dao = new ManipulateurRadioDAO("manipulateurradio.json");
        ManipulateurRadioService service = new ManipulateurRadioService(dao);

    }
    public void proprietes(ManipulateurRadio m) {
        ManipulateurRadioUI.ManipulateurRadioProprietes(m);
    }
}
