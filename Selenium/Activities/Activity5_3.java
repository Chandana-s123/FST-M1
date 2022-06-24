package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity5_3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://training-support.net/selenium/dynamic-controls");

        String title = driver.getTitle();
        System.out.println("Page title : " + title);
        System.out.println("TextBox is enabled- "+driver.findElement(By.id("input-text")).isEnabled());
        driver.findElement(By.id("toggleInput")).click();
        System.out.println("TextBox is enabled- "+driver.findElement(By.id("input-text")).isEnabled());
        driver.close();

    }
}
