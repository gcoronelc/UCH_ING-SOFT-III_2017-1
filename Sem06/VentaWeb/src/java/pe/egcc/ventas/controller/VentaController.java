package pe.egcc.ventas.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.egcc.ventaapp.model.VentaModel;
import pe.egcc.ventaapp.service.impl.VentaServiceMemo;
import pe.egcc.ventaapp.service.spec.VentaServiceSpec;


@WebServlet(name = "VentaController", 
        urlPatterns = {"/ProcesarVenta", "/ConsultarVentas", "/cccc"})
public class VentaController extends HttpServlet {

  private VentaServiceSpec ventaService;

  @Override
  public void init() throws ServletException {
    ventaService = new VentaServiceMemo();
  }
  
  
  @Override
  protected void service(HttpServletRequest request, 
          HttpServletResponse response) 
          throws ServletException, IOException {
    String path = request.getServletPath();
    switch(path){
      case "/ProcesarVenta":
        procesarVenta(request,response);
        break;
      case "/ConsultarVentas":
        consultarVentas(request,response);
        break;
    }
  }

  private void procesarVenta(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    try {
      // Datos
      String categoria = request.getParameter("categoria");
      String producto = request.getParameter("producto");
      String cliente = request.getParameter("cliente");
      double precio = Double.parseDouble(request.getParameter("precio"));
      int cantidad = Integer.parseInt(request.getParameter("cantidad"));
      // Proceso
      VentaModel model = new VentaModel(categoria, cliente, producto, precio, cantidad);
      model = ventaService.calcVenta(model);
      ventaService.regVenta(model);
      // Fin
      request.setAttribute("mensaje", "Proceso ok.");
    } catch (Exception e) {
      request.setAttribute("error", e.getMessage());
    }
    // Forward
    UtilController.forward(request, response, "registrarVenta.jsp");
  }

  private void consultarVentas(HttpServletRequest request, 
          HttpServletResponse response) 
          throws ServletException, IOException {
  try {
      // Datos
      String categoria = request.getParameter("categoria");
      // Proceso
      List<VentaModel> ventas = ventaService.listadoVentas(categoria);
      // Fin
      if(!ventas.isEmpty()){
      request.setAttribute("ventas", ventas);
      request.setAttribute("mensaje", "Proceso ok");
      }
    } catch (Exception e) {
      request.setAttribute("error", e.getMessage());
    }
    // Forward
    UtilController.forward(request, response, "consultarVentas.jsp");  
  }

  
  
  
}
