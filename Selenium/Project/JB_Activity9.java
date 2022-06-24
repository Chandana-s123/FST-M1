package Job_Board;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class JB_Activity9 {
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
        this.addNewJob("Testing");
    }

    //Method to addNewJob
    public void addNewJob(String jobTitle){
        driver.findElement(By.xpath("//div[@class = 'wp-menu-name' and text() = 'Job Listings ']")).click();
        driver.findElement(By.linkText("Add New")).click();
        driver.findElement(By.id("post-title-0")).sendKeys(jobTitle);
        driver.findElement(By.id("_company_website")).sendKeys("ibm.com");
        driver.findElement(By.id("_company_twitter")).sendKeys("@IBM");
        driver.findElement(By.id("_job_location")).sendKeys("Banglore");
        driver.findElement(By.id("_company_name")).sendKeys("IBM");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.xpath("//button[text()='Publish…']")).click();
        WebElement publishButton = driver.findElement(By.xpath("//button[text()='Publish']"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='Publish']")));
        publishButton.click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='Published']")));
        Assert.assertTrue(driver.findElement(By.linkText(jobTitle)).isDisplayed());
        System.out.println(jobTitle + " is created successfully");
    }
}
