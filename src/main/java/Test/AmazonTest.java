package Test;


import PageObject.Amazon;
import Resources.launchChrome;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AmazonTest extends launchChrome {

    Amazon amazon;
    String amazonUrl ="https://www.amazon.com/b/?node=16548547011&ref_=nav_signin&";


    @Test(priority = 1)
    public void testOne() throws InterruptedException {
        driver.get(amazonUrl);
        amazon = new Amazon(driver);
       // Actions action = new Actions(driver);
        amazon.loginToAmazon();
       // Thread.sleep(5000);

      //  amazon.loginToAmazon("ahmedrubal92@gmail.com");
      //  WebElement con =driver.findElement(By.xpath("//input[@id='continue']"));





    }
}
