package Test;

import PageObject.NewToursPage;
import PageObject.OrangeHome;
import Resources.launchChrome;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test extends launchChrome {

    OrangeHome orangeHome;
    NewToursPage newToursPage;


    @org.testng.annotations.Test(priority=1)
    public void pageFactory() throws InterruptedException {

        driver.get("https://opensource-demo.orangehrmlive.com/");
        orangeHome  = new OrangeHome(driver);
        orangeHome .email().sendKeys("Admin");
        Thread.sleep(5000);
        orangeHome.pass().sendKeys("admin123");
        Thread.sleep(5000);
        orangeHome.login().click();
        Thread.sleep(5000);

    }
    @org.testng.annotations.Test(priority=2)
    public void pageObject(){

        newToursPage  = new NewToursPage(driver);
        driver.get("https://www.facebook.com/");
        newToursPage.login();



    }
}
