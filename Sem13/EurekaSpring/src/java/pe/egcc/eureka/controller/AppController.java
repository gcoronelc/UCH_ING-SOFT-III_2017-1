package pe.egcc.eureka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pe.egcc.eureka.model.Empleado;
import pe.egcc.eureka.service.AppService;
import pe.egcc.eureka.service.EmpleadoService;

@Controller
public class AppController {

  @Autowired
  private AppService appService;
  
  @Autowired
  private EmpleadoService empleadoService;
  
  @RequestMapping(value = "/index.htm", method = RequestMethod.GET)
  public String home(){
    return "index";
  }
  
  @RequestMapping(value = "/login.htm", method = RequestMethod.POST)
  public String login(
          @RequestParam("usuario") String usuario, 
          @RequestParam("clave") String clave,
          Model model){

    String destino;
    try {
      Empleado bean = empleadoService.validar(usuario, clave);
      if(bean == null){
        throw new Exception("Datos incorrectos.");
      }
      destino = "main";
    } catch (Exception e) {
      destino = "index";
      model.addAttribute("error", e.getMessage());
    }
    return destino;
  }
  
  @RequestMapping(value = "/generales.htm", method = RequestMethod.GET)
  public String generales(Model model){
    
    model.addAttribute("cantCuentas", appService.getCantCuentas());
    model.addAttribute("saldoSoles", appService.getSaldoMoneda("01"));
    model.addAttribute("saldoDolares", appService.getSaldoMoneda("02"));
    
    
    return "generales";
  }
  
  
  

  
}
