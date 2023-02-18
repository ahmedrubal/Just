package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class NewToursPage {
     public WebDriver driver;


    By userId =By.xpath("//input[@name='userName']");
    By pasId = By.xpath("//input[@id='pass']");
    By login= By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']");

    public NewToursPage(WebDriver driver){

        this.driver = driver;
    }
    public void login(){
        driver.findElement(userId).clear();
        driver.findElement(userId).sendKeys("ahmedrubal92@gmail.com");
        driver.findElement(pasId).clear();
        driver.findElement(pasId).sendKeys("muhibul#987");
        driver.findElement(login).click();

    }


}
