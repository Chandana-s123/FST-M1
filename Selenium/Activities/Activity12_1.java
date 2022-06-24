package activities;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/iframes");
        System.out.println("Page title - " +driver.getTitle());
        driver.switchTo().frame(0);
        WebElement frame1 = driver.findElement(By.xpath("//div[@class = 'content']"));
        System.out.println(frame1.getText());
        WebElement frame1Button = driver.findElement(By.id("actionButton"));
        System.out.println("Button text - " +frame1Button.getText()+"\n Button color - "+frame1Button.getCssValue("color"));
        frame1Button.click();
        System.out.println("Button text - " +frame1Button.getText()+"\n Button color - "+frame1Button.getCssValue("color"));
        driver.switchTo().defaultContent();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        //driver.findElement(By.xpath("//div[@class = 'content']")).sendKeys(Keys.PAGE_DOWN);
        driver.switchTo().frame(1);
        WebElement frame2 = driver.findElement(By.xpath("//div[@class = 'content']"));
        //frame2.sendKeys(Keys.PAGE_DOWN);
        WebElement frame2Button = driver.findElement(By.id("actionButton"));
        System.out.println(frame2.getText());
        System.out.println("Button text - " +frame2Button.getText()+"\n Button color - "+frame2Button.getCssValue("color"));

        //Thread.sleep(3000);
        frame2Button.click();
        System.out.println("Button text - " +frame2Button.getText()+"\n Button color - "+frame2Button.getCssValue("color"));
        driver.close();
    }
}
