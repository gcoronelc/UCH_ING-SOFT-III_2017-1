package pe.egcc.eureka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pe.egcc.eureka.service.AppService;

@Controller
public class AppController {

  @Autowired
  private AppService appService;
  
  @RequestMapping(value = "/index.htm", method = RequestMethod.GET)
  public String home(){
    return "index";
  }
  
  @RequestMapping(value = "/login.htm", method = RequestMethod.POST)
  public String login(){
    return "main";
  }
  
  @RequestMapping(value = "/generales.htm", method = RequestMethod.GET)
  public String generales(Model model){
      
      model.addAttribute("menuGenerales", "cssLinkMenuActivo");
    
    model.addAttribute("cantCuentas", appService.getCantCuentas());
    model.addAttribute("saldoSoles", appService.getSaldoMoneda("01"));
    model.addAttribute("saldoDolares", appService.getSaldoMoneda("02"));
    
    
    return "generales";
  }
  
  
  

  
}
