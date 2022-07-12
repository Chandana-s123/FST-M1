package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTestSteps {

    WebDriver driver = new FirefoxDriver();
    WebDriverWait wait;


    @Given("^User is on Login page$")
        public void userlogin(){
            driver.get("https://www.training-support.net/selenium/login-form");
        }
    @When("^User enters username and password$")
    public void userLogin(){
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    @When("^User enters \"(.*)\" and \"(.*)\"")
    public void userLogin(String userName, String password){
        driver.findElement(By.id("username")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("^Read the page title and confirmation message$")
    public void readPageTitle(){
        String pageTitle = driver.getTitle();
        System.out.println("Page title is: " + pageTitle);
        String confirmMessage = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message is: " + confirmMessage);
    }

    @And("^Close the Browser$")
    public void closeBrowser(){
        driver.close();
    }
}