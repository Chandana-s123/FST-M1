package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;

public class Activity10_3 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        Actions pageActions = new Actions(driver);
        driver.get("https://training-support.net/selenium/drag-drop");
        System.out.println("page title - "+driver.getTitle());
        Actions dragDrop = new Actions(driver);
        WebElement ball = driver.findElement(By.id("draggable"));
        WebElement dropZone1 = driver.findElement(By.id("droppable"));
        WebElement dropZone2 = driver.findElement(By.id("dropzone2"));
        dragDrop.dragAndDrop(ball,dropZone1).perform();
        wait.until(ExpectedConditions.attributeToBeNotEmpty(dropZone1,"background-color"));
        System.out.println("Ball entered the zone1");
        dragDrop.dragAndDrop(ball,dropZone2).perform();
        wait.until(ExpectedConditions.attributeToBeNotEmpty(dropZone2,"background-color"));
        System.out.println("Ball entered the zone2");
        driver.close();
    }
}
