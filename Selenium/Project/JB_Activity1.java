package Job_Board;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JB_Activity1 {
    WebDriver driver; //Webdriver declaration

    //Launch browser and go to the specified URL
    @BeforeTest
    public void openBrowser(){
        driver = new FirefoxDriver(); //Firefox driver initialization
        driver.get("https://alchemy.hguy.co/jobs");
    }

    //Close the browser method
    @AfterTest
    public void closeBrowser(){
        driver.close();
    }

    //Method to verify the title of website
    @Test
    public void verifyTitle(){
        Assert.assertEquals(driver.getTitle(),"Alchemy Jobs – Job Board Application");
    }
}
