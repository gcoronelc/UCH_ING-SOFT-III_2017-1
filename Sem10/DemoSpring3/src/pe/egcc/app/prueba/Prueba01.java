package pe.egcc.app.prueba;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pe.egcc.app.facade.AppFacade;

public class Prueba01 {
  
  public static void main(String[] args) {
    
    String contexto = "/pe/egcc/app/spring/contexto.xml";
    BeanFactory factory = new ClassPathXmlApplicationContext(contexto);
    
    AppFacade facade = factory.getBean(AppFacade.class);
    
    System.out.println("7 + 5 = " + facade.sumar(7, 5));
    
    
  }
   
}
