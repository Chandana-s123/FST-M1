package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/simple-form");
        System.out.println("Title of page :" + driver.getTitle());
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("My First Name");
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("My Last Name");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("email@gmail.com");
        driver.findElement(By.xpath("//input[@id='number']")).sendKeys("1234567890");
        driver.findElement(By.xpath("//textarea")).sendKeys("Message info");
        driver.findElement(By.xpath("//input[contains(@class,'green')]")).submit();
        driver.close();
    }
}
