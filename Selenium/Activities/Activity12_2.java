package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12_2 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/nested-iframes");
        System.out.println("Page title = "+driver.getTitle());
        driver.switchTo().frame(0).switchTo().frame(0);
        WebElement insideFrame1 = driver.findElement(By.xpath("//div[@class = 'content']"));
        System.out.println(insideFrame1.getText());
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0).switchTo().frame(1);
        WebElement insideFrame2 = driver.findElement(By.xpath("//div[@class = 'content']"));
        System.out.println(insideFrame2.getText());
        driver.close();

    }
}
