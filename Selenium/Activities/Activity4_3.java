package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
        System.out.println("Title of page :" + driver.getTitle());
        System.out.println("Third header text - " +driver.findElement(By.xpath("//h3[@id='third-header']")).getText());
        System.out.println("Fifth header CSS value is - " +driver.findElement(By.xpath("//h3")).getCssValue("color"));
        System.out.println("Violet button class attribute details - "+driver.findElement(By.xpath("//button[text() = 'Violet']")).getAttribute("class"));
        System.out.println("Grey button text - " +driver.findElement(By.xpath("//button[text() = 'Grey']")).getText());
        driver.close();
    }

}
