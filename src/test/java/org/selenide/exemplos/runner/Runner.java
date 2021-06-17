package org.selenide.exemplos.runner;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.junit.TextReport;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.runner.RunWith;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "org.selenide.exemplos.steps",
        features = "src/test/resources/feature/crudTransportadora.feature" ,
        plugin = "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm",
        //formato legivelmonochrome=true
        monochrome = true
)
public class Runner {

    private static FirefoxDriver driver;
    @Rule
    public TestRule report = new TextReport().onFailedTest(true).onSucceededTest(true);

    @BeforeClass
    public static void configure() {
//        Configuration.timeout = 30000;
//        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
//        Configuration.browser = "chrome";
//        Configuration.startMaximized = true;



        Configuration.timeout = 30000;
        System.setProperty("webdriver.gecko.driver" , "C:\\geckodriver.exe");
        Configuration.browser = "firefox";
        Configuration.startMaximized = true;

        Proxy proxy = new Proxy();
        proxy.setHttpProxy("localhost:1337");
        proxy.setSslProxy("localhost:1337");

        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("proxy", proxy);

        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("start-maximized");

        capabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);

        driver = new FirefoxDriver(capabilities);

//        FirefoxProfile profile = new FirefoxProfile();
//        profile.setPreference("network.proxy.type", 1);
//        profile.setPreference("network.proxy.http", "localhost");
//        profile.setPreference("network.proxy.http_port", 3128);
//        WebDriver driver = new FirefoxDriver(capabilities);


//        driver = new FirefoxDriver();
//        driver.manage().window().maximize();

    }

}