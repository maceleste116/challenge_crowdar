package qa.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.testng.Assert;
import qa.conf.DriverConfig;
import qa.pageobjects.CarritoTiendaServices;
import qa.pageobjects.HomeTiendaServices;
import qa.tasks.IngresarTienda;
import qa.tasks.NavigateTo;
import qa.tasks.ValidarIngresoCliente;

import java.io.IOException;


@CucumberContextConfiguration
@ContextConfiguration(classes = {DriverConfig.class})
public class IngresarTiendaStepDefs {

    @Autowired
    private NavigateTo navigateTo;

    @Autowired
    private HomeTiendaServices homeTiendaServices;

    @Autowired
    private CarritoTiendaServices carritoTiendaServices;

    @Autowired
    private IngresarTienda ingresarTienda;

    @Autowired
    private ValidarIngresoCliente validarIngresoCliente;



    @Given("^cliente quiere ir a home tienda$")
    public void cliente_quiere_ir_a_home_tienda() throws IOException {
        navigateTo.homePage();
        System.out.print("Estoy en la tienda");
    }

    @When("^cliente ingresa (.+) (.+) en home tienda correctamente$")
    public void cliente_ingresa_en_home_tienda_correctamente(String username, String passwd) throws Throwable {
        ingresarTienda.ingresarTiendaOk(username,passwd);
    }

    @Then("^cliente ingresa a tienda$")
    public void cliente_ingresa_a_tienda() {
        Assert.assertTrue(validarIngresoCliente.validarIngresoClienteOk());

    }

    @When("^cliente ingresa (.+) (.+) en home tienda incorrectamente$")
    public void cliente_ingresa_en_home_tienda_incorrectamente(String username, String passwd) throws Throwable {
        ingresarTienda.ingresarTiendaNoOk(username,passwd);
    }

    @Then("^cliente no ingresa a tienda$")
    public void cliente_no_ingresa_a_tienda() throws Throwable {
        Assert.assertTrue(validarIngresoCliente.validarIngresoClienteNoOk());
    }


}







