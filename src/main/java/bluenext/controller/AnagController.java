package bluenext.controller;

import bluenext.model.Anagrafica;
import bluenext.service.AnagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class AnagController {

    @Autowired
    private AnagService anaService;

    @GetMapping(value = "/anagrafica")
    public ModelAndView creaAnagraficaView(){
        ModelAndView mv = new ModelAndView("anagrafica");
        mv.addObject( "anag", new Anagrafica());


        return  mv;
    }

    @PostMapping("/anagrafica")
    public ModelAndView creaAnagrafica(Anagrafica a, BindingResult r){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/anagrafica");
        mv.addObject( "anag", new Anagrafica());
        //mv.addObject("anagrafiche",anaService.getAnagrafiche());





        return mv;
    }


}
