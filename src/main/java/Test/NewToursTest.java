package Test;

import PageObject.NewToursPage;
import Resources.launchBrowser;
import UtilsPackage.url;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewToursTest extends launchBrowser {
  //  NewToursPage newToursPage;
  // url url;
    String urlOfPage = "https://www.facebook.com/";
   // String dra= "http://demo.guru99.com/test/drag_drop.html";
    @Test(priority = 2)
    public void loginMethod() throws InterruptedException {
       // url= new url ();
       // url.getApplication(urlOfPage);
        //create login page object
        launchBrowser lb = new launchBrowser();
       driver.get(urlOfPage);
        NewToursPage nt =  new NewToursPage(driver);
        nt.login();
       // Thread.sleep(5000);
     //  String getsignoff =newToursPage.getSignOff();
      // Assert.assertEquals(getsignoff,"SIGN-OFF");
       // newToursPage.getSignOff();


    }






    }



