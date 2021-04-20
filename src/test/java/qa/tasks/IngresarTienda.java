package qa.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import qa.pageobjects.CarritoTiendaServices;
import qa.pageobjects.HomeTiendaServices;

@Component
@Scope("cucumber-glue")
public class IngresarTienda {

    @Autowired
    private HomeTiendaServices homeTiendaServices;

    @Autowired
    private CarritoTiendaServices carritoTiendaServices;


    public void ingresarTiendaOk(String username,String passwd) {
        homeTiendaServices.writeInputUsername(username);
        homeTiendaServices.writeInputPassword(passwd);
        homeTiendaServices.clickOnButtonLogin();
        carritoTiendaServices.clickOnButtonMenu();
        carritoTiendaServices.clickOnLogout();
    }

    public void ingresarTiendaNoOk(String username,String passwd) {
        homeTiendaServices.writeInputUsername(username);
        homeTiendaServices.writeInputPassword(passwd);
        homeTiendaServices.clickOnButtonLogin();
    }


}
