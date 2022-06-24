package Job_Board;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JB_Activity5 {
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

    //Navigate to Job page
    @Test
    public void navigate(){
        driver.findElement(By.linkText("Jobs")).click();
        Assert.assertEquals(driver.getTitle(),"Jobs – Alchemy Jobs");
    }
}
