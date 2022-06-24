package Job_Board;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class JB_Activity7 {
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

    //Method to apply for job
    @Test
    public void applyJob(){
        this.postJobs("SAP Testing","test89343@gmail.com","Banglore","Full Time", "abc@gmail.com","banking Domain","IBM");
        searchJobs("SAP Testing");
    }

    //Search and lists the jobs of given job title
    public void postJobs(String jobTitle,String emailAddr,String jobLocation,String jobType,String email,String jobDescription,String companyName){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.linkText("Post a Job")).click();
        driver.findElement(By.id("create_account_email")).sendKeys(emailAddr);
        driver.findElement(By.id("job_title")).sendKeys(jobTitle);
        driver.findElement(By.id("job_location")).sendKeys(jobLocation);

        WebElement dropdown = driver.findElement(By.id("job_type"));
        Select select = new Select(dropdown);
        select.selectByIndex(3);
        driver.findElement(By.id("job_description_ifr")).sendKeys("\n" + jobDescription);
        driver.findElement(By.cssSelector("#application")).sendKeys(email);
        driver.findElement(By.id("company_name")).sendKeys(companyName);
        driver.findElement(By.xpath("//input[@value='Preview']")).click();
        driver.findElement((By.id("job_preview_submit_button"))).click();

    }

    public void searchJobs(String jobTitle){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.linkText("Jobs")).click();
        Assert.assertEquals(driver.getTitle(),"Jobs – Alchemy Jobs");
        driver.findElement(By.id("search_keywords")).sendKeys(jobTitle);
        driver.findElement(By.xpath("//input[@value='Search Jobs']")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[@class=\"job_listings\"]"))).isDisplayed();
        WebElement jobList = driver.findElement(By.xpath("//ul[@class='job_listings']/li[1]/a/div/h3"));
        Assert.assertEquals(jobList.getText(),jobTitle);
    }


}
