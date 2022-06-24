package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Date;

public class Activity11_3 {
        public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        System.out.println("page title - " + driver.getTitle());
        driver.findElement(By.id("prompt")).click();
        Alert promptAlert = driver.switchTo().alert();
        Thread.sleep(5000);
        promptAlert.sendKeys( "Yes, you are!");
        Thread.sleep(5000);
        promptAlert.accept();
        driver.close();
    }
}
