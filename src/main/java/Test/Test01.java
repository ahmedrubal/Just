package Test;

import PageObject.HomePage;
import Resources.Browser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Test01 extends Browser {
    String url ="https://opensource-demo.orangehrmlive.com/";

    HomePage homePage;
    @Test
    public void loginHome() throws InterruptedException {

        homePage = new HomePage(driver);
        driver.get(url);
        Thread.sleep(10000);
        homePage.userName.sendKeys("Admin");

        homePage.passWord.sendKeys("admin123");
        homePage.loginBtn.click();

    }
}
