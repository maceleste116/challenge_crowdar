package qa.conf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import qa.enums.Browser;
import qa.util.DriverFactory;

import java.net.MalformedURLException;
import java.time.Duration;

@Configuration
@ComponentScan(basePackages = "qa")
@PropertySource("classpath:/application.properties")
public class DriverConfig {

    @Value("${driver.type}")
    private Browser driverType;

    @Value("${element.wait.timeout.seconds}")
    private int webDriverWaitTimeOut;

    @Autowired
    private DriverFactory driverFactory;


    @Bean
    public WebDriver webDriver() throws MalformedURLException {
        return driverFactory.get(driverType);
    }

    @Bean
    public WebDriverWait waitFor() throws MalformedURLException {

        return new WebDriverWait(webDriver(), Duration.ofSeconds(webDriverWaitTimeOut));
    }

}
