package pe.uch.JAASwebApp.servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.uch.JAASwebApp.security.uchCallbackHandler;
import pe.uch.JAASwebApp.security.uchLoginModule;

/**
 *
 * @author sac
 */
@WebServlet(name="Authenticationservlet", urlPatterns = {"/AuthenticationServlet"})
public class AuthenticationServlet extends HttpServlet {

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.println("<html><head><tittle>Proyecto web con JAAS</tittle></head><body>"); 
        String user = request.getParameter("user");
        String password = request.getParameter("password");
        
        if((user!=null)&&(password != null)){
            //uchCallbackHandler uchCBH = new uchCallbackHandler(user, password);
             boolean authenticatedFlag= true;
            
            try {
                LoginContext loginContext = new LoginContext("JaasPrueba", new uchCallbackHandler(user, password));
                loginContext.login();
                
            } catch (LoginException e) {
                authenticatedFlag=false;
            }
           if (authenticatedFlag) {
               pw.println("autenticacion realizada ..."); 
           
           }else  {
               //RequestDispatcher rd = request.getRequestDispatcher("repo.jsp");
               pw.println("autenticacion fallida ..."+authenticatedFlag ); 
           }
          
        }else {
            pw.println("autenticacion invalida...");
        }
        pw.println("</body></html>");
        
        }
    

}
