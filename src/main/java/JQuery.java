import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class JQuery {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//
//       // driver.get("https://jqueryui.com/droppable/");
//        driver.get("https://jqueryui.com/resizable/");
//       // WebElement DragAble = driver.findElement(By.xpath("//a[text()='Draggable']"));
//       // Actions action = new Actions(driver);
//        //WebElement DragAble = driver.findElement(By.xpath("//a[text()='Draggable']"));
//       // action.moveToElement(DragAble).click();
//        driver.switchTo().frame(0);
////        Thread.sleep(5000);
////       WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
////       WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
////      Actions action = new Actions(driver);
////      action.dragAndDrop(drag,drop).perform();
//      WebElement resizable = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
//        Actions action1= new Actions(driver);
//        action1.moveByOffset(0,100).build().perform();
//
////        action.clickAndHold(drag).moveByOffset(20,50).build().perform();

        driver.get("http://demo.guru99.com/test/drag_drop.html");

// Drag and drop using clickAndHold method
        Actions action1= new Actions(driver);
        WebElement amt =driver.findElement(By.xpath("//a[@class='button button-orange']/following::li[1]"));
        WebElement debitamt= driver.findElement(By.xpath("//li[@class='placeholder']/following::li[1]"));
        action1.clickAndHold(amt).moveToElement(debitamt).release(debitamt).build().perform();

        Thread.sleep(5000);

// Drag and drop using dragAndDrop method

      //:  driver.close();

    }
}
