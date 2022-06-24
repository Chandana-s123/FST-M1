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
import java.time.Instant;

public class JB_Activity6 {
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

    //Method to search and apply for job
    @Test
    public void applyJob(){
        this.searchJobs("Banking");
        String emailAddr = applyForFirstListedJob();
        System.out.println("Email Address for Job Application - "+emailAddr);
    }

    //Search and lists the jobs of given job title
    public void searchJobs(String jobTitle){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.linkText("Jobs")).click();
        Assert.assertEquals(driver.getTitle(),"Jobs – Alchemy Jobs");
        driver.findElement(By.id("search_keywords")).sendKeys(jobTitle);
        driver.findElement(By.xpath("//input[@value='Search Jobs']")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[@class=\"job_listings\"]"))).isDisplayed();
        driver.findElement(By.xpath("//ul[@class='job_listings']/li[1]")).click();

    }

    //Apply of the first job in the list
    public String applyForFirstListedJob(){
        driver.findElement(By.xpath("//input[@value='Apply for job']")).click();
        String emailAddr = driver.findElement(By.className("job_application_email")).getText();
        return emailAddr;

    }
}
