package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Activity11_4 {
        public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://www.training-support.net/selenium/tab-opener");
        System.out.println(driver.getTitle());
        String parentWindow = driver.getWindowHandle();
        System.out.println(parentWindow);
        driver.findElement(By.id("launcher")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : driver.getWindowHandles()) {
                        driver.switchTo().window(handle);
                }
        wait.until(ExpectedConditions.titleIs("Newtab"));
        System.out.println(driver.getTitle());
        System.out.println(driver.getWindowHandle());
        driver.findElement(By.linkText("Open Another One!")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
        for (String handle : driver.getWindowHandles()) {
                driver.switchTo().window(handle);
        }
        System.out.println(driver.getTitle());
        System.out.println(driver.getWindowHandle());
        driver.quit();
    }
}
