package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://training-support.net/selenium/dynamic-attributes");

        String title = driver.getTitle();
        System.out.println("Page title : " + title);
        driver.findElement(By.xpath("//input[contains(@class,'-username')]")).sendKeys("admin");
        driver.findElement(By.xpath("//input[contains(@class,'-password')]")).sendKeys("password");
        driver.findElement(By.xpath("//label[text() = 'Confirm Password']//following::input")).sendKeys("password");
        driver.findElement(By.xpath("//input[starts-with(@class,'email')]")).sendKeys("abc@gmail.com");
        driver.findElement(By.xpath("//button[@onclick='signUp()']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='action-confirmation']")));
        System.out.println("Message after successful SignUp: "+driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText());
        driver.close();
    }
}
