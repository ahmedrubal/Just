package Test;

import PageObject.OrangeHrm;
import Resources.launchBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHrmTest  {
    @Test
    public void login(){
       System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       driver.get("https://opensource-demo.orangehrmlive.com/");
        OrangeHrm hr = new OrangeHrm(driver);
        hr.loginId().sendKeys("Admin");
        hr.loginPassword().sendKeys("admin123");
        hr.loginButton().click();

    }
}
