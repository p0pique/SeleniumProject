package testService.test;

import org.junit.Assert;
import org.junit.Test;
import testService.core.BaseSeleniumTest;
import testService.pages.MainPage;

import static testService.jdbcService.DbService.connection;

public class GmailTest extends BaseSeleniumTest {

    @Test
    public void checkPage() {
//        MainPage mainPage = new MainPage();
//        Assert.assertTrue(mainPage.logo.isDisplayed());
        connection();
    }
}
