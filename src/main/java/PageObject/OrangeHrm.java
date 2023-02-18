package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHrm {
   WebDriver driver;
   public OrangeHrm(WebDriver driver){
       this.driver=driver;
       PageFactory.initElements(driver,this);
   }
   @FindBy(xpath = "//input[@id='txtUsername']")
   WebElement userName;
   @FindBy(xpath = "//input[@id='txtPassword']")
    WebElement passWord;
   @FindBy(xpath = "//input[@id='btnLogin']")
    WebElement loginBtn;
   public WebElement loginId(){
       return userName;

   }
    public WebElement loginPassword(){
        return passWord;

    }
    public WebElement loginButton(){
        return loginBtn;

    }

}
