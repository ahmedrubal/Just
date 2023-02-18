package Resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class Browser {
    public WebDriver driver;
    @BeforeSuite
    public WebDriver launch(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
    @AfterSuite
    public void closeWindow(){
        driver.close();
    }

}
