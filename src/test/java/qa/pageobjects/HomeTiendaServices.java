package qa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class HomeTiendaServices {

    @Autowired
    private WebDriver driver;

    @Autowired
    private WebDriverWait wait;

    @Autowired
    private HomeTiendaPage homeTiendaPage;


    public void writeInputUsername(String username) {
        this.wait.until(ExpectedConditions.visibilityOf(this.homeTiendaPage.getUsername()));
        this.homeTiendaPage.getUsername().sendKeys(username);
    }

    public void writeInputPassword(String password) {
        this.wait.until(ExpectedConditions.visibilityOf(this.homeTiendaPage.getPassword()));
        this.homeTiendaPage.getPassword().sendKeys(password);
    }

    public void clickOnButtonLogin() {
        this.wait.until(ExpectedConditions.visibilityOf(this.homeTiendaPage.getLoginButton()));
        this.homeTiendaPage.getLoginButton().click();
    }

    public boolean isPresentLogin(){
        this.wait.until(ExpectedConditions.visibilityOf(this.homeTiendaPage.getLoginButton()));
        boolean isLogin = this.homeTiendaPage.getLoginButton().isDisplayed();
        return isLogin;
    }

    public boolean isPresentErrorLogin(){
        this.wait.until(ExpectedConditions.visibilityOf(this.homeTiendaPage.getLoginButton()));
        boolean isLoginError = this.homeTiendaPage.getLoginButton().isDisplayed();
        return isLoginError;
    }
}