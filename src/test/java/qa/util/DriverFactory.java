package qa.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import qa.enums.Browser;

import java.net.MalformedURLException;

@Component
public class DriverFactory {

    @Value("${grid.url}")
    private String gridUrl;

    public WebDriver get(Browser browser) throws MalformedURLException {

        if (Browser.chrome == browser) {
            new DesiredCapabilities();
            //System.setProperty("webdriver.chrome.driver", "C:\\Users\\berdinas\\IdeaProjects\\drivers\\win\\chromedriver.exe");
            System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
            return new ChromeDriver();
        }

        if (Browser.firefox == browser) {
            new DesiredCapabilities();
            //System.setProperty("webdriver.gecko.driver", "C:\\Users\\berdinas\\IdeaProjects\\drivers\\win\\geckodriver.exe");
            System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/geckodriver.exe");
            return new FirefoxDriver();
        }

        throw new IllegalArgumentException("Driver not found for browser: " + browser);
    }
}
