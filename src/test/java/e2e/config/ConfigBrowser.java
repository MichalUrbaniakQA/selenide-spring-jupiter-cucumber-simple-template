package e2e.config;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.spring.CucumberContextConfiguration;
import org.openqa.selenium.Dimension;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

@TestPropertySource("classpath:application-test.properties")
@ContextConfiguration(classes = TestConfig.class)
@CucumberContextConfiguration
public class ConfigBrowser {

    @Value("${wiki.url}")
    private String wikiUrl;


    @Before(order = 1)
    public void setConfiguration() {
        Configuration.fastSetValue = true;
        Configuration.screenshots = true;
        Configuration.timeout = 10000;
        Configuration.reportsFolder = "reports/screens";
    }

    @Before(order = 2)
    public void openUrl() {
        open(wikiUrl);

    }

    @Before(order = 3)
    public void configureWindowsSize() {
        if (System.getProperty("os.name").contains("Windows")) {
            getWebDriver().manage().window().maximize();
        } else {
            getWebDriver().manage().window().setSize(new Dimension(1920, 1080));
        }
    }

    @After
    public void close() {
        getWebDriver().manage().deleteAllCookies();
        clearBrowserCookies();
        closeWebDriver();
    }
}
