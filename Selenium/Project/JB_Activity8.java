package Job_Board;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JB_Activity8 {
    WebDriver driver; //Webdriver declaration

    //Launch browser and go to the specified URL
    @BeforeTest
    public void openBrowser(){

        driver = new FirefoxDriver(); //Firefox driver initialization
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");

    }

    //Close the browser method
    @AfterTest
    public void closeBrowser(){
        driver.close();
    }

    //Method to login to backend site
    @Test
    public void login(){
        driver.findElement(By.id("user_login")).sendKeys("root");
        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("wp-submit")).click();
        WebElement loginUser = driver.findElement(By.xpath("//span[@class = 'display-name']"));
        Assert.assertEquals(loginUser.getText(), "root");

    }

}
