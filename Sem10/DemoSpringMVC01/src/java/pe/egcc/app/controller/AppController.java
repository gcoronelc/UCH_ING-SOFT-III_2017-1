package pe.egcc.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pe.egcc.app.service.MateService;

@Controller
public class AppController {
  
  @Autowired
  private MateService mateService;
  
  @RequestMapping(value = "/index.htm", method = RequestMethod.GET)
  public String home(){
    return "index";
  }
  
  @RequestMapping(value = "/sumar.htm", method = RequestMethod.GET)
  public String sumar(){
    return "sumar";
  }
  
  @RequestMapping(value = "/sumar.htm", method = RequestMethod.POST)
  public String sumar(
      @RequestParam("num1") int n1,
      @RequestParam("num2") int n2,
          Model model
  ){
    // Proceso
    int suma = mateService.sumar(n1, n2);
    // Reporte
    model.addAttribute("n1", n1);
    model.addAttribute("n2", n2);
    model.addAttribute("su", suma);
    return "sumar";
  }
  
  
  @RequestMapping(value = "/multiplicar.htm", method = RequestMethod.GET)
  public String multiplicar(){
    return "multiplicar";
  }
  
  @RequestMapping(value = "/multiplicar.htm", method = RequestMethod.POST)
  public String multiplicar(
      @RequestParam("num1") int n1,
      @RequestParam("num2") int n2,
          Model model
  ){
    // Proceso
    int rpta = mateService.multiplicar(n1, n2);
    // Reporte
    model.addAttribute("n1", n1);
    model.addAttribute("n2", n2);
    model.addAttribute("rpta", rpta);
    return "multiplicar";
  }
}
