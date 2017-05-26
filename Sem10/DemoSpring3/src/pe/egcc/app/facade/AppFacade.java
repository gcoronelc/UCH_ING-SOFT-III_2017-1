package pe.egcc.app.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pe.egcc.app.service.MateService;

@Controller
public class AppFacade {

  @Autowired
  private MateService mateService;

  public int sumar(int n1, int n2) {
    return mateService.sumar(n1, n2);
  }

}
