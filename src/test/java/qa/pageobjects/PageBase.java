package qa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("cucumber-glue")
public class PageBase {
    protected WebDriver webDriver;

    @Autowired
    public PageBase(WebDriver webDriver){
        this.webDriver = webDriver;
        webDriver.manage().window().maximize();
        //webDriver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
        PageFactory.initElements(webDriver,this);
    }
}
