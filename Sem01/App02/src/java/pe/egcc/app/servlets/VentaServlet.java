package pe.egcc.app.servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.egcc.app.model.VentaModel;
import pe.egcc.app.service.VentaService;

@WebServlet(name = "VentaServlet", urlPatterns = {"/VentaServlet"})
public class VentaServlet extends HttpServlet {

  @Override
  protected void service(HttpServletRequest request,
          HttpServletResponse response) throws ServletException, IOException {

    // Variables
    double precio, cant, importe, impuesto, total;

    // Datos
    precio = Double.parseDouble(request.getParameter("precio"));
    cant = Double.parseDouble(request.getParameter("cant"));
    VentaModel model = new VentaModel(precio, cant);

    // Proceso
    VentaService service = new VentaService();
    model = service.procesar(model);

    // Forward
    request.setAttribute("model", model);
    RequestDispatcher rd = request.getRequestDispatcher("respuesta.jsp");
    rd.forward(request, response);
  }

}
