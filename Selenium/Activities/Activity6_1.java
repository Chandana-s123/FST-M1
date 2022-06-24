package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://training-support.net/selenium/dynamic-controls");

        String title = driver.getTitle();
        System.out.println("Page title : " + title);
        if((driver.findElement(By.id("dynamicCheckbox")).isDisplayed()) == true)
            driver.findElement(By.id("toggleCheckbox")).click();
        if((driver.findElement(By.id("dynamicCheckbox")).isDisplayed()) == false)
            driver.findElement(By.id("dynamicCheckbox")).isDisplayed();
        driver.findElement(By.id("toggleCheckbox")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dynamicCheckbox")));
        driver.findElement(By.xpath("//input[@class = 'willDisappear']")).click();

        driver.close();





    }
}
