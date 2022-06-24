package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/");
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);

        Thread.sleep(5000);
        WebElement idEle = driver.findElement(By.id("about-link"));
        WebElement classEle = driver.findElement(By.className("green"));
        WebElement linkTestEle = driver.findElement(By.linkText("About Us"));
        WebElement cssEle = driver.findElement(By.cssSelector(".green"));

        System.out.println("Text in idEle: " + idEle.getText());
        System.out.println("Text in classEle: " + classEle.getText());
        System.out.println("Text in linkTestEle: " + linkTestEle.getText());
        System.out.println("Text in cssEle: " + cssEle.getText());

        driver.close();

    }
}
