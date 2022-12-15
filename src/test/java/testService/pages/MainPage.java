package testService.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testService.core.BaseSeleniumPage;

public class MainPage extends BaseSeleniumPage {

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/img")
    public WebElement logo;

    public MainPage() {
        driver.get("https://www.google.com/");
        PageFactory.initElements(driver, this);
    }
}
