package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity12_3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        driver.get("https://www.training-support.net/selenium/popups");
        System.out.println("Page Title = "+driver.getTitle());
        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(By.xpath("//button[@class = 'ui huge inverted orange button']"))).build().perform();
        Thread.sleep(5000);
        System.out.println("Tooltip text: " +driver.findElement(By.xpath("//button[@class = 'ui huge inverted orange button']")).getAttribute("data-tooltip"));
        builder.release();
        //builder.click(driver.findElement(By.xpath("//button[@data-tooltip='Click to sign in']"))).click();
       driver.findElement(By.xpath("//button[@class = 'ui huge inverted orange button']")).click();
        //driver.getWindowHandle();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        System.out.println("Login message - "+driver.findElement(By.id("action-confirmation")).getText());
        driver.close();
    }
}
