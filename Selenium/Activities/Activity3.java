package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/simple-form");
        System.out.println("Title of page :" + driver.getTitle());
        driver.findElement(By.id("firstName")).sendKeys("My First Name");
        driver.findElement(By.id("lastName")).sendKeys("My Last Name");
        driver.findElement(By.id("email")).sendKeys("email@gmail.com");
        driver.findElement(By.id("number")).sendKeys("1234567890");
        driver.findElement(By.xpath("//input[contains(@class,'green')]")).submit();
        driver.close();
    }

}
