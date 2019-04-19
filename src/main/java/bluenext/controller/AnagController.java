package bluenext.controller;

import bluenext.model.Anagrafica;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AnagController {

    @GetMapping(value = "/anagrafica")
    public ModelAndView creaAmagraficaView(){
        ModelAndView mv = new ModelAndView("anagrafica");
        mv.addObject( "anag", new Anagrafica());


        return  mv;
    }


}
