package pe.egcc.ventas.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public final class UtilController {

  private UtilController() {
  }
  
  public static void forward(HttpServletRequest request, 
          HttpServletResponse response, String target) 
          throws ServletException, IOException{
    RequestDispatcher rd;
    rd = request.getRequestDispatcher(target);
    rd.forward(request, response);
  }
  
}
