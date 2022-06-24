package activities;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.Date;

public class Activity10_2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        Actions pageActions = new Actions(driver);
        driver.get("https://www.training-support.net/selenium/input-events");
        pageActions
                .keyDown(Keys.SHIFT)
                .sendKeys("c")
                .keyUp(Keys.SHIFT).perform();
        System.out.println(driver.findElement(By.id("keyPressed")).getText());
        Thread.sleep(5000);
        Action copyPaste = pageActions
                .keyDown(Keys.CONTROL)
                .sendKeys("a")
                .sendKeys("c")
                .keyUp(Keys.CONTROL).build();
        copyPaste.perform();
        System.out.println("Copied text - "+copyPaste);
        driver.close();
    }
}
