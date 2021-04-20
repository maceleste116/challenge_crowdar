package qa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class CarritoTiendaServices {

    @Autowired
    private WebDriver driver;

    @Autowired
    private WebDriverWait wait;

    @Autowired
    private CarritoTiendaPage carritoTiendaPage;

    public void clickOnButtonMenu() {
        this.wait.until(ExpectedConditions.visibilityOf(this.carritoTiendaPage.getMenu()));
        this.carritoTiendaPage.getMenu().click();
    }


    public void clickOnLogout() {
        this.wait.until(ExpectedConditions.visibilityOf(this.carritoTiendaPage.getLogout()));
        this.carritoTiendaPage.getLogout().click();

    }
}
