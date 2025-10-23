package cz.czechitas.java2webapps.lekce2.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Random;

@Controller
public class MainController {
    public final Random random = new Random();

    @GetMapping("/")
    public ModelAndView pokus() {
        ModelAndView modelAndView = new ModelAndView("kostka");
        modelAndView.addObject("cislo",hodKostkou());
        return modelAndView;
    }

    public int hodKostkou(){
        return random.nextInt(6)+1;
    }
}
