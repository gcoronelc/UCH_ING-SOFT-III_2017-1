package pe.egcc.ventas.listeners;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import pe.egcc.ventaapp.service.impl.VentaServiceMemo;
import pe.egcc.ventaapp.service.spec.VentaServiceSpec;

/**
 * Web application lifecycle listener.
 *
 * @author Alumno-UCH
 */
public class AppListener1 implements ServletContextListener {

  @Override
  public void contextInitialized(ServletContextEvent sce) {
    VentaServiceSpec ventaService = new VentaServiceMemo();
    ServletContext context = sce.getServletContext();
    context.setAttribute("categorias", ventaService.getCategorias());
  }

  @Override
  public void contextDestroyed(ServletContextEvent sce) {
  }
}
