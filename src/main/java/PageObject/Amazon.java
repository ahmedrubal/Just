package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Amazon {
    private WebDriver driver;
// @FindBy (xpath = "//span[@class='nav-line-2 nav-long-width']")
//   private WebElement mouseHOver;
  @FindBy ( xpath="//a[@class='nav-a nav-a-2  '][1]")
  private WebElement signIn;
   @FindBy(xpath="//input[@id='ap_email']")
   private WebElement userId;
   @FindBy (xpath="//input[@id='continue']")
    private WebElement clickcontinue;
   @FindBy (xpath="//input[@id='ap_password']")
   private WebElement passId;
    @FindBy (xpath="//input[@id='signInSubmit']")
    private WebElement continuePass;


    public Amazon(WebDriver driver){
        this.driver = driver;
     PageFactory.initElements(driver,this);

    }
    public void loginToAmazon() throws InterruptedException {
     //  mouseHOver.click();

       signIn.click();
       // Thread.sleep(5000);
      // userId.clear();
        Thread.sleep(5000);
       userId.sendKeys("ahmedrubal92@gmail.com");
        clickcontinue.click();
        passId.clear();
       passId.sendKeys("muhibul92");
       continuePass.click();



    }
}
