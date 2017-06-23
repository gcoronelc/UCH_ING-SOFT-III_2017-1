package pe.egcc.eureka.controller;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pe.egcc.eureka.model.Cliente;
import pe.egcc.eureka.service.ClienteService;
import pe.egcc.eureka.util.EurekaUtil;

@Controller
public class ClienteController {

  @Autowired
  private ClienteService clienteService;

  @RequestMapping(value = "cliente.htm", method = RequestMethod.GET)
  public String cliente() {
    return "cliente";
  }

  @RequestMapping(value = "cliente.htm",
          method = RequestMethod.POST)
  public String cliente(
          @RequestParam("codigo") String codigo,
          Model model) {
    // Proceso
    //Cliente bean = clienteService.getCliente(codigo);
    Cliente bean = clienteService.getCliente2(codigo);

    // Reporte
    model.addAttribute("bean", bean);
    return "cliente";
  }

  @RequestMapping(value = "clientes.htm", method = RequestMethod.GET)
  public String clientes() {
    return "clientes";
  }

  @RequestMapping(value = "clientes.htm",
          method = RequestMethod.POST)
  public String clientes(
          @RequestParam("criterio") String criterio,
          Model model) {
    // Proceso
    //List<Cliente> lista = clienteService.getClientes(criterio);
    //List<Cliente> lista = clienteService.getClientes2(criterio);
    List<Map<String, Object>> lista = clienteService.getClientes3(criterio);

    // Reporte
    model.addAttribute("criterio", criterio);
    model.addAttribute("lista", lista);
    return "clientes";
  }

  // ==========================================================
  // CRUD DE CLIENTES
  // ==========================================================
  @RequestMapping(value = "crudClientes.htm", method = RequestMethod.GET)
  public String crudClientes(Model model) {

    model.addAttribute("crudClientes", "cssLinkMenuActivo");

    return "crudClientes";
  }

  @RequestMapping(value = "crudClientesConsultar.htm", method = RequestMethod.GET)
  public String crudClientesConsultar(
          @ModelAttribute Cliente bean,
          Model model) {

    String destino;
    model.addAttribute("crudClientes", "cssLinkMenuActivo");

    destino = "crudClientesLista";
    List<Cliente> lista = clienteService.read(bean);
    model.addAttribute("lista", lista);
    model.addAttribute("bean", bean);

    return destino;
  }

  @RequestMapping(value = "crudClientesNuevo.htm", method = RequestMethod.GET)
  public String crudClientesNuevo(Model model) {

    Cliente bean = new Cliente();
    bean.setCodigo(EurekaUtil.CRUD_NUEVO);
    
    model.addAttribute("crudClientes", "cssLinkMenuActivo");
    model.addAttribute("accion", EurekaUtil.CRUD_NUEVO);
    model.addAttribute("bean", bean);
    
    return "crudClientesEditar";
  }
  
  @RequestMapping(value = "crudClientesEditar.htm", method = RequestMethod.GET)
  public String crudClientesEditar(
          @RequestParam("codigo") String codigo,
          Model model) {

    Cliente bean = clienteService.read(codigo);
    
    model.addAttribute("crudClientes", "cssLinkMenuActivo");
    model.addAttribute("accion", EurekaUtil.CRUD_EDITAR);
    model.addAttribute("bean", bean);
    
    return "crudClientesEditar";
  }
  
  @RequestMapping(value = "crudClientesEliminar.htm", method = RequestMethod.GET)
  public String crudClientesEliminar(
          @RequestParam("codigo") String codigo,
          Model model) {

    Cliente bean = clienteService.read(codigo);
    
    model.addAttribute("crudClientes", "cssLinkMenuActivo");
    model.addAttribute("accion", EurekaUtil.CRUD_ELIMINAR);
    model.addAttribute("bean", bean);
    model.addAttribute("disabled", "disabled");
    
    return "crudClientesEditar";
  }
  
  
  @RequestMapping(value = "crudClientesGrabar.htm", method = RequestMethod.POST)
  public String crudClientesGrabar(
          @ModelAttribute Cliente bean,
          @RequestParam("accion") String accion,
          Model model) {
    
    model.addAttribute("crudClientes", "cssLinkMenuActivo");
    String mensaje = "";
    try {
      switch(accion){
        case EurekaUtil.CRUD_NUEVO:
          clienteService.create(bean);
          mensaje = "Cliente creado con código " + bean.getCodigo();
          break;
      }
    } catch (Exception e) {
      model.addAttribute("error", e.getMessage());
    }
    
    model.addAttribute("mensaje", mensaje);
    
    return "crudClientes";
  }

}
