package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_1 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        Actions cube = new Actions(driver);
        driver.get("https://www.training-support.net/selenium/input-events");
        System.out.println("Page title: "+driver.getTitle());
        WebElement cubeClick = driver.findElement(By.id("D3Cube"));
        cube.click(cubeClick).perform();
        System.out.println("Left click " +driver.findElement( By.xpath("//div[@class='active']")).getText());
        cube.doubleClick(cubeClick).perform();
        System.out.println("Double click " +driver.findElement( By.xpath("//div[@class='active']")).getText());
        cube.contextClick(cubeClick).perform();
        System.out.println("Right click " +driver.findElement(By.xpath("//div[@class='active']")).getText());
        driver.close();
    }
}
