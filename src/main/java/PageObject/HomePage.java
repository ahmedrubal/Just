package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
     WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@name='txtUsername']")
   public WebElement userName;
    @FindBy(xpath = "//input[@id='txtPassword']")
    public WebElement passWord;
    @FindBy(xpath = "//input[@name='Submit']")
    public WebElement loginBtn;




    public WebElement id() {
        return userName;

    }

    public WebElement pass() {
        return passWord;
    }

    public WebElement button() {
        return loginBtn;
    }
}