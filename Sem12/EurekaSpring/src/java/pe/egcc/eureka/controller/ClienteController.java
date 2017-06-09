package pe.egcc.eureka.controller;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pe.egcc.eureka.model.Cliente;
import pe.egcc.eureka.service.ClienteService;

@Controller
public class ClienteController {
  
  @Autowired
  private ClienteService clienteService;
  
  @RequestMapping(value = "cliente.htm", method = RequestMethod.GET)
  public String cliente(){
    return "cliente";
  }
  
  @RequestMapping(value = "cliente.htm", 
          method = RequestMethod.POST)
  public String cliente(
          @RequestParam("codigo") String codigo, 
          Model model){
    // Proceso
    //Cliente bean = clienteService.getCliente(codigo);
    Cliente bean = clienteService.getCliente2(codigo);
    
    // Reporte
    model.addAttribute("bean", bean);
    return "cliente";
  }
  
  @RequestMapping(value = "clientes.htm", method = RequestMethod.GET)
  public String clientes(){
    return "clientes";
  }
  
  @RequestMapping(value = "clientes.htm", 
          method = RequestMethod.POST)
  public String clientes(
          @RequestParam("criterio") String criterio, 
          Model model){
    // Proceso
    //List<Cliente> lista = clienteService.getClientes(criterio);
    //List<Cliente> lista = clienteService.getClientes2(criterio);
    List<Map<String,Object>> lista = clienteService.getClientes3(criterio);
    
    // Reporte
    model.addAttribute("criterio", criterio);
    model.addAttribute("lista", lista);
    return "clientes";
  }
}
