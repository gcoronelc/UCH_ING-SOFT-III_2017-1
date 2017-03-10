package pe.egcc.app.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

    // Proceso
    total = precio * cant;
    importe = total / 1.18;
    impuesto = total - importe;

    // Reporte
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<title>VENTA</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>VENTA</h1>");
    out.println("<p>Importe: " + importe + "</p>");
    out.println("<p>Impuesto: " + impuesto + "</p>");
    out.println("<p>Total: " + total + "</p>");
    out.println("<p><a href='index.html'>Retornar</a></p>");
    out.println("</body>");
    out.println("</html>");

  }

}
