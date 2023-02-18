package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHome {
    WebDriver driver;
    public  OrangeHome(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@id='txtUsername']")
   public WebElement userName;
    @FindBy(xpath = "//input[@id='txtPassword']")
   public WebElement passWord;
    @FindBy(xpath = "//input[@id='btnLogin']")
   public WebElement loginBtn;




    public WebElement email(){
        return userName;
    }
    public WebElement pass(){
        return passWord;
    }
    public WebElement login(){
        return loginBtn;
    }

}
