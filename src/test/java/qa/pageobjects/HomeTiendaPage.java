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
public class HomeTiendaPage extends PageBase {
    @Autowired
    public HomeTiendaPage(WebDriver driver){
        super(driver);
    }

    @FindBy(id="user-name")
    private WebElement username;

    @FindBy(id="password")
    private WebElement password;

    @FindBy(id="login-button")
    private WebElement loginButton;

    @FindBy(xpath="//div[@id='login_button_container']/div/form/div[3]/h3")
    private WebElement loginError;

}
