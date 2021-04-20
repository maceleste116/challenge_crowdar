package qa.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import qa.pageobjects.CarritoTiendaServices;
import qa.pageobjects.HomeTiendaServices;

@Component
@Scope("cucumber-glue")
public class ValidarIngresoCliente {

    @Autowired
    private HomeTiendaServices homeTiendaServices;

    @Autowired
    private CarritoTiendaServices carritoTiendaServices;

    public boolean validarIngresoClienteOk(){
       boolean login = homeTiendaServices.isPresentLogin();
       return login;
    }

    public boolean validarIngresoClienteNoOk(){
        boolean loginError = homeTiendaServices.isPresentErrorLogin();
        return loginError;
    }






}
