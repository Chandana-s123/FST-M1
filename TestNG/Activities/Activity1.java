package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Driver;

public class Activity1 {
    WebDriver driver;

    @Test
    public void testMethod(){
        String title = driver.getTitle();
        Assert.assertEquals(title,"Training Support");
        driver.findElement((By.id("about-link"))).click();
        System.out.println("About Us page title - "+driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"About Training Support");
    }

    @BeforeMethod
    public void openBrowser(){
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
    }

    @AfterMethod
    public void closeBrowser(){
        driver.close();

    }

}
