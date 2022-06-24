package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        System.out.println("page title - " + driver.getTitle());
        driver.findElement(By.id("confirm")).click();
        Alert confirmationAlert = driver.switchTo().alert();
        System.out.println("Alert text - " +confirmationAlert.getText());
        Thread.sleep(5000);
        System.out.println("Close the Alert");
        confirmationAlert.accept();
        System.out.println("Open the Alert again and Dismiss the Alert");
        driver.findElement(By.id("confirm")).click();
        Thread.sleep(5000);
        confirmationAlert.dismiss();
        driver.close();
    }
}
