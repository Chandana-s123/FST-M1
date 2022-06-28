package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity10 {


    WebDriver driver;
    Actions builder;
    @BeforeTest
    public void openBrowser(){
        driver = new FirefoxDriver();
        builder = new Actions(driver);
        driver.get("https://www.training-support.net/selenium/sliders");
    }

    @AfterTest
    public void closeBrowser(){
        driver.close();
    }

    @Test
    public void midValue(){
        WebElement slider = driver.findElement(By.id("slider"));
        slider.click();
        String sliderVal = driver.findElement(By.id("value")).getText();
        Reporter.log("Mid Slider value is - " +sliderVal);
        Assert.assertEquals(sliderVal,"50");

    }
    @Test
    public void maxValue(){
        WebElement slider = driver.findElement(By.id("slider"));
        builder.clickAndHold(slider).moveByOffset(75,0).release().build().perform();
        String sliderVal = driver.findElement(By.id("value")).getText();
        Reporter.log("Max Slider value is - " +sliderVal);
        Assert.assertEquals(sliderVal,"100");

    }
    @Test
    public void minValue(){
        WebElement slider = driver.findElement(By.id("slider"));
        builder.clickAndHold(slider).moveByOffset(-75,0).release().build().perform();
        String sliderVal = driver.findElement(By.id("value")).getText();
        Reporter.log("min Slider value is - " +sliderVal);
        Assert.assertEquals(sliderVal,"0");

    }
    @Test
    public void thirtyPercentValue(){
        WebElement slider = driver.findElement(By.id("slider"));
        builder.clickAndHold(slider).moveByOffset(-30,0).release().build().perform();
        String sliderVal = driver.findElement(By.id("value")).getText();
        Reporter.log("30% Slider value is - " +sliderVal);
        Assert.assertEquals(sliderVal,"30");

    }
    @Test
    public void eightyPercentvalue() {
        WebElement slider = driver.findElement(By.id("slider"));
        builder.clickAndHold(slider).moveByOffset(44,0).release().build().perform();
        String sliderVal = driver.findElement(By.id("value")).getText();
        Reporter.log("80% Slider value is - " +sliderVal);
        Assert.assertEquals(sliderVal,"80");
    }

}
