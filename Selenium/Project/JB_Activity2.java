package Job_Board;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JB_Activity2 {
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

    //Method to Verify the Heading of website
    @Test
    public void verifyHeading(){
        String heading = driver.findElement(By.cssSelector("h1.entry-title")).getText();
        Assert.assertEquals(heading,"Welcome to Alchemy Jobs");
    }
}
