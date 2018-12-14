package fr.laerce.cinemaJPA.web;

import fr.laerce.cinemaJPA.dao.PersonsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    PersonsDao personnes;

    @GetMapping("/")
    public String main(Model model){
        model.addAttribute("nom","Cher Cinéphile");
        return "index";
    }

    @GetMapping("/listepersonnes")
    public String listepersonnes(Model model){
//        model.addAttribute("nom","Cher Cinéphile");
        model.addAttribute("personnes",personnes.getAll());
        return "listepersonnes";
    }

}
