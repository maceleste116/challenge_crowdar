package qa.pageobjects;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Getter
@Scope("cucumber-glue")
public class CarritoTiendaPage extends PageBase {

    @Autowired
    public CarritoTiendaPage(WebDriver driver){
        super(driver);
    }

    @FindBy(id="react-burger-menu-btn")
    private WebElement menu;

    @FindBy(id="inventory_sidebar_link")
    private WebElement allItems;

    @FindBy(id="logout_sidebar_link")
    private WebElement logout;


}
