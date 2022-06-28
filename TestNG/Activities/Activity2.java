package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import org.testng.SkipException;
import org.testng.annotations.*;

public class Activity2 {
    WebDriver driver;

    @Test
    public void testMethod1(){
        String title = driver.getTitle();
        Assert.assertEquals(title,"Target Practice");
    }
    @Test
    public void testMethod2(){
        WebElement blackButton = driver.findElement(By.className("ui black button"));
        Assert.assertTrue(blackButton.isDisplayed());
        Assert.assertEquals(blackButton.getText(),"Black");
    }
    @Test(enabled = false)
    public void testMethod3(){
        System.out.println("Skip method");
    }
    @Test
    public void testMethod4() throws SkipException{
        throw new SkipException("Skip method with exception");
    }

    @BeforeTest
    public void openBrowser(){
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
    }

    @AfterTest
    public void closeBrowser(){
        driver.close();

    }

}