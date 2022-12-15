package testService.core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

abstract public class BaseSeleniumTest {
    protected WebDriver webDriver;

//    @Before
//    public void setUp() {
//        WebDriverManager.chromedriver().setup();
//        webDriver = new ChromeDriver();
//        webDriver.manage().window().maximize();
//        webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        BaseSeleniumPage.setDriver(webDriver);
//    }
//
//    @After
//    public void tearDown() {
//        webDriver.close();
//        webDriver.quit();
//    }
}
